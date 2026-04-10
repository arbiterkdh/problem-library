function solution(s) {
    if(s.length % 2 === 1) return 0;
    s += s;
    let matchCnt = 0;
    const parentheses = {
        "(": ")",
        "{": "}",
        "[": "]",
    };
    for(let i = 0; i < s.length / 2; i++) {
        const stack = [];
        let flag = true;

        for (let j = i; j < i + s.length / 2; j++) {
            if (s[j] in parentheses) {
                stack.push(s[j]);
            } else if(parentheses[stack.pop()] !== s[j]) {
                flag = false
                break;
            }
        }

        if (stack.length == 0 && flag) {
            matchCnt++;
        }
    }

    return matchCnt;
}