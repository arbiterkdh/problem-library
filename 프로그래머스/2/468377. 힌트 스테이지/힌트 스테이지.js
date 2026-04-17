function solution(cost, hint) {
    const n = cost.length;
    let minTotalCost = Infinity;

    const bundles = hint.map((h, i) => {
        const price = h[0];
        const hCnt = new Array(n).fill(0);
        for (let j = 1; j < h.length; j++) {
            hCnt[h[j] - 1]++;
        }
        return { price, hCnt };
    });

    function dfs(stageIdx, currentCost, hintsOwned) {
        if (currentCost >= minTotalCost) return;

        const useCount = Math.min(hintsOwned[stageIdx], n - 1);
        const stageClearCost = cost[stageIdx][useCount];

        if (stageIdx === n - 1) {
            minTotalCost = Math.min(minTotalCost, currentCost + stageClearCost);
            return;
        }

        dfs(stageIdx + 1, currentCost + stageClearCost, hintsOwned);

        const { price, hCnt } = bundles[stageIdx];
        const nextHintsOwned = [...hintsOwned];

        for (let i = stageIdx + 1; i < n; i++) {
            nextHintsOwned[i] += hCnt[i];
        }

        dfs(stageIdx + 1, currentCost + stageClearCost + price, nextHintsOwned);
    }

    dfs(0, 0, new Array(n).fill(0));

    return minTotalCost;
}