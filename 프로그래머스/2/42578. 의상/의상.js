function solution(clothes) {
    let cases = 1;
    const clothesMap = new Map();
    for (let [name, category] of clothes) {
        clothesMap.set(category, (clothesMap.get(category) ?? 0) + 1);
    }
    for (let clothCnt of clothesMap.values()) {
        cases *= clothCnt + 1;
    }
    return cases - 1;
}