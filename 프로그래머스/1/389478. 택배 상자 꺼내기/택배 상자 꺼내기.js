function solution(n, w, num) {
    
    let answer = Math.ceil(n / w) - Math.ceil(num / w);
    let isTopEven = parseInt((n - 1) / w) % 2 == 0;
    let lastIdx = isTopEven ? (n - 1) % w : w - (n % w);
    lastIdx %= w;
    let isNumEven = parseInt((num - 1) / w) % 2 == 0;
    let numIdx = isNumEven ? (num - 1) % w : w - (num % w);
    numIdx %= w;
    
    if (isTopEven) {
        if (numIdx <= lastIdx) {
            answer += 1;
        }
    } else {
        if (numIdx >= lastIdx) {
            answer += 1;
        }
    }
    
    return answer;
}