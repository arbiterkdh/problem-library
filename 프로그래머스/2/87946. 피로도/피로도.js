function solution(k, dungeons) {
    const raidables = new Array(dungeons.length).fill(true);
    let raidableCnt = 0;
    function raid(pirodo, depth) {
        raidableCnt = Math.max(raidableCnt, depth);
        for (let i = 0; i < dungeons.length; i++) {
            if (!raidables[i]) continue;
            if (pirodo >= dungeons[i][0] && pirodo - dungeons[i][1] >= 0) {
                raidables[i] = false;
                raid(pirodo - dungeons[i][1], depth + 1);
                raidables[i] = true;
            }
        }
    }
    raid(k, 0);
    return raidableCnt;
}