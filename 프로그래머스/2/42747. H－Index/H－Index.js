function solution(citations) {
    const reversed = citations.sort((a, b) => b - a);
    let hIndex = 0;
    for (let h = 0; h < reversed.length; h++) {
        if (reversed[h] < h + 1) break;
        hIndex++;
    }
    return hIndex;
}