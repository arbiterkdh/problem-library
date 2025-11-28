function solution(players, callings) {
    let ranking = [];
    let len = players.length;
    let nameKeyRanking = new Map();
    let numberKeyRanking = new Map();
    
    for (let rank = 0; rank < len; rank++) {
        nameKeyRanking.set(players[rank], rank);
        numberKeyRanking.set(rank, players[rank]);
    }
    
    let behindNum = 0;
    let aheadName = "";
    for (let behindName of callings) {
        behindNum = nameKeyRanking.get(behindName);
        aheadName = numberKeyRanking.get(behindNum-1);
        nameKeyRanking.set(behindName, behindNum-1);
        nameKeyRanking.set(aheadName, behindNum);
        numberKeyRanking.set(behindNum-1, behindName);
        numberKeyRanking.set(behindNum, aheadName);
    }
    
    for (let rank = 0; rank < len; rank++) {
        ranking.push(numberKeyRanking.get(rank));
    }
    
    return ranking;
}