function solution(n, left, right) {
    const arr = new Array(right - left + 1);
    for (let i = 0; i < arr.length; i++) {
        const col = (left + i) % n;
        const row = Math.floor((left + i) / n);
        arr[i] = Math.max(row, col) + 1;
    }
    return arr;
}