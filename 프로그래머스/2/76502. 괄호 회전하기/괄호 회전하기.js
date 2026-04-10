function solution(s) {
    if (s.length < 2) return 0;
    const sArr = s.split("");
    const openers = ["(", "{", "["];
    const closers = [")", "}", "]"];
    let matchCnt = 0;
    
    for (let i = 0; i < sArr.length; i++) {
        const copyArr = [...sArr];
        let position = 0;
        for (let j = 0; j < sArr.length && copyArr.length; j++) {
            if (openers.some((opener, idx) => opener === copyArr[j] && closers[idx] === copyArr[j + 1])) {
                copyArr.splice(j, 2);
                j -= 2;
            }
        }
        if (!copyArr.length) {
            matchCnt++;
        }
        sArr.push(sArr.shift());
    }
    return matchCnt;
}