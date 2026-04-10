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
        for (let j = 0; j < sArr.length; j++) {
            if (sArr[j] === parentheses[stack[stack.length - 1]]) {
                stack.pop();
            } else {
                stack.push(sArr[j]);
            }
        }
        if (!stack.length) {
            matchCnt++;
        }
        sArr.push(sArr.shift());
    }
    return matchCnt;
}