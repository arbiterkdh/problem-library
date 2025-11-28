function solution(players, callings) {
    let len = players.length;
    let nameKeyRanking = new Map();
    
    for (let rank = 0; rank < len; rank++) {
        nameKeyRanking.set(players[rank], rank);
    }
    
    let behindNum = 0;
    let aheadName = "";
    for (let behindName of callings) {
        behindNum = nameKeyRanking.get(behindName);
        aheadName = players[behindNum-1];
        nameKeyRanking.set(behindName, behindNum-1);
        nameKeyRanking.set(aheadName, behindNum);
        players[behindNum-1] = behindName;
        players[behindNum] = aheadName;
    }
    
    return players;
}