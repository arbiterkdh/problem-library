function solution(elements) {
    let cases = new Set(elements);
    cases.add(elements.reduce((acc, curr) => acc + curr, 0));
    
    let caseLen = 2;
    let tmpElements = [];
    let addNum = 0;
    
    while (caseLen < elements.length) {
        tmpElements = [...elements, ...elements.slice(0, caseLen)];
        for (let i = 0; i < elements.length; i++) {
            for (let j = i, k = 0; k < caseLen; j++, k++) {
                addNum += tmpElements[j];
            }
            cases.add(addNum);
            addNum = 0;
        }
        caseLen++;
    }
    
    return cases.size;
}