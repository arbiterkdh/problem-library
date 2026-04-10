function solution(s) {
    if (s.length % 2 == 1) return 0;

    let matchCnt = 0;
    const sArr = s.split("");
    const parentheses = {
        "(": ")",
        "{": "}",
        "[": "]",
    };

    for (let i = 0; i < sArr.length; i++) {
        const stack = [];
        let flag = true;
        for (let j = 0; j < sArr.length; j++) {
            if (sArr[j] in parentheses) {
                stack.push(sArr[j]);
            } else if (parentheses[stack.pop()] !== sArr[j]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            matchCnt++;
        }
        sArr.push(sArr.shift());
    }
    return matchCnt;
}