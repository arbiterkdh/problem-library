function solution(want, number, discount) {
    let answer = 0, i;
    let wantLength = want.length;
    let wantTotal = 0;
    let wantMap = new Map();
    
    for (i = 0; i < wantLength; i++) {
        wantMap.set(want[i], number[i]);
        wantTotal += number[i];
    }

    for (let j = 0; j <= discount.length - wantTotal; j++) {
        let tmpWantMap = new Map(wantMap);
        let tmpTotal = 0;
        for (i = 0; i < wantTotal; i++) {
            if (tmpWantMap.get(discount[j + i]) > 0) {
                tmpWantMap.set(discount[j + i], tmpWantMap.get(discount[j + i]) - 1);
                tmpTotal++;
            }
        }
        if (tmpTotal == wantTotal) {
            answer++;
        }
    }
    
    return answer;
}