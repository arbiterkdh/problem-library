function solution(regenSkill, maxHp, attackWaves) {
    let currWave = 0;
    let currHp = maxHp;
    let regenComboCnt = 0;
    let [regenMaxTime, regenPerSec, regenEndBonus] = regenSkill;
    
    for (let sec = 1; sec <= attackWaves.at(-1)[0]; sec++) {
        if (attackWaves[currWave][0] == sec) {
            currHp -= attackWaves[currWave][1];
            regenComboCnt = 0;
            
            if (currHp < 1) {
                return -1;
            } else {
                currWave++;
                continue;
            }
        }
        
        currHp = Math.min(maxHp, currHp + regenPerSec);
        regenComboCnt++;
        if (regenComboCnt == regenMaxTime) {
            currHp = Math.min(maxHp, currHp + regenEndBonus);
            regenComboCnt = 0;
        }
    }

    return currHp;
}