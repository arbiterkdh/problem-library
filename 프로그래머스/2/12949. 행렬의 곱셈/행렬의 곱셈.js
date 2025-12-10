function solution(arr1, arr2) {
    var answer = [];
    let tmp = 0;
    for (let y1 = 0; y1 < arr1.length; y1++) {
        answer.push([]);
        for (let x2 = 0; x2 < arr2[0].length; x2++) {
            tmp = 0;
            for (let x1 = 0, y2 = 0; x1 < arr1[y1].length, y2 < arr2.length; x1++, y2++) {
                tmp += arr1[y1][x1] * arr2[y2][x2];
            }
            answer[y1].push(tmp);
        }
    }
    
    return answer;
}