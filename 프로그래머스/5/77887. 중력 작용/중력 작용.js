function solution(values, edges, queries) {
    const N = values.length;
    const adj = Array.from({ length: N + 1 }, () => []);
    for (const [u, v] of edges) {
        adj[u].push(v);
        adj[v].push(u);
    }

    const order = [1];
    const parent = new Int32Array(N + 1);
    const depth = new Int32Array(N + 1);
    const sz = new Int32Array(N + 1).fill(1);
    const heavyChild = new Int32Array(N + 1);

    let headIdx = 0;
    while (headIdx < order.length) {
        const u = order[headIdx++];
        for (const v of adj[u]) {
            if (v !== parent[u]) {
                parent[v] = u;
                depth[v] = depth[u] + 1;
                order.push(v);
            }
        }
    }

    for (let i = N - 1; i >= 0; i--) {
        const u = order[i];
        const p = parent[u];
        if (p !== 0) {
            sz[p] += sz[u];
            if (heavyChild[p] === 0 || sz[u] > sz[heavyChild[p]]) {
                heavyChild[p] = u;
            }
        }
    }

    const head = new Int32Array(N + 1);
    const chainId = new Int32Array(N + 1);
    const pos = new Int32Array(N + 1);
    const chainStarts = [];
    const chainLengths = [];
    let timer = 1;
    let numChains = 0;

    for (const u of order) {
        if (head[u] === 0) {
            let curr = u;
            const cId = numChains++;
            chainStarts.push(timer);
            let length = 0;
            while (curr !== 0) {
                head[curr] = u;
                chainId[curr] = cId;
                pos[curr] = timer++;
                length++;
                curr = heavyChild[curr];
            }
            chainLengths.push(length);
        }
    }

    const L = new Int32Array(N + 1);
    const R = new Int32Array(N + 1);
    const SZ = new Int32Array(N + 1);
    const PRI = new Float32Array(N + 1);
    const VAL = new BigInt64Array(N + 1);
    const SUM = new BigInt64Array(N + 1);

    for (let i = 1; i <= N; i++) {
        PRI[i] = Math.random();
        SZ[i] = 1;
    }

    function update(u) {
        if (u !== 0) {
            SZ[u] = SZ[L[u]] + SZ[R[u]] + 1;
            SUM[u] = SUM[L[u]] + SUM[R[u]] + VAL[u];
        }
    }

    function split(u, k) {
        if (u === 0) return [0, 0];
        const leftSz = SZ[L[u]];
        if (k <= leftSz) {
            const [leftTree, newL] = split(L[u], k);
            L[u] = newL;
            update(u);
            return [leftTree, u];
        } else {
            const [newR, rightTree] = split(R[u], k - leftSz - 1);
            R[u] = newR;
            update(u);
            return [u, rightTree];
        }
    }

    function merge(u, v) {
        if (u === 0 || v === 0) return u || v;
        if (PRI[u] > PRI[v]) {
            R[u] = merge(R[u], v);
            update(u);
            return u;
        } else {
            L[v] = merge(u, L[v]);
            update(v);
            return v;
        }
    }

    const chainRoots = new Int32Array(numChains);
    for (const u of order) {
        if (head[u] === u) {
            let curr = u;
            let root = 0;
            while (curr !== 0) {
                VAL[curr] = BigInt(values[curr - 1]);
                update(curr);
                root = merge(root, curr);
                curr = heavyChild[curr];
            }
            chainRoots[chainId[u]] = root;
        }
    }

    const initSubSum = new BigInt64Array(N + 1);
    for (let i = N - 1; i >= 0; i--) {
        const u = order[i];
        initSubSum[u] += BigInt(values[u - 1]);
        if (parent[u] !== 0) initSubSum[parent[u]] += initSubSum[u];
    }

    const bit = new BigInt64Array(N + 1);
    function bitAdd(idx, delta) {
        for (; idx <= N; idx += idx & -idx) bit[idx] += delta;
    }
    function bitQuery(idx) {
        let s = 0n;
        for (; idx > 0; idx -= idx & -idx) s += bit[idx];
        return s;
    }

    for (let u = 1; u <= N; u++) {
        let ls = 0n;
        for (const v of adj[u]) {
            if (v !== parent[u] && v !== heavyChild[u]) ls += initSubSum[v];
        }
        bitAdd(pos[u], ls);
    }

    const result = [];
    for (let [u, w] of queries) {
        if (w === -1) {
            const cId = chainId[u];
            const uIdx = pos[u] - chainStarts[cId];
            const [t1, t2] = split(chainRoots[cId], uIdx);
            const valSum = SUM[t2];
            chainRoots[cId] = merge(t1, t2);
            
            const endIdx = chainStarts[cId] + chainLengths[cId] - 1;
            const lsSum = bitQuery(endIdx) - bitQuery(pos[u] - 1);
            result.push(Number(valSum + lsSum));
        } else {
            let curr = u;
            const path = [];
            while (curr !== 0) {
                const cId = chainId[curr];
                path.push({ cId, xI: pos[curr] - chainStarts[cId] });
                curr = parent[head[curr]];
            }
            path.reverse();

            const target = path[path.length - 1];
            const [t1, t2] = split(chainRoots[target.cId], target.xI);
            const [targetNode, t3] = split(t2, 1);
            const deletedVal = VAL[targetNode];
            chainRoots[target.cId] = merge(t1, merge(targetNode, t3));

            let vIn = BigInt(w);
            for (let i = 0; i < path.length; i++) {
                const { cId, xI } = path[i];
                const [p1, p2] = split(chainRoots[cId], xI);
                const [vOutNode, p3] = split(p2, 1);
                const vOut = VAL[vOutNode];

                VAL[vOutNode] = vIn;
                update(vOutNode);
                chainRoots[cId] = merge(vOutNode, merge(p1, p3));

                if (i < path.length - 1) {
                    bitAdd(chainStarts[cId] + xI, vOut - deletedVal);
                }
                vIn = vOut;
            }
        }
    }
    return result;
}