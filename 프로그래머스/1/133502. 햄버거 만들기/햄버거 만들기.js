function solution(ingredient) {
    let order = [1, 2, 3, 1];
    let burgerCnt = 0;
    
    for (let i = 0; i < ingredient.length; i++) {
        if (order.every((ingNum, idx) => ingNum == ingredient[i + idx])) {
            ingredient.splice(i, 4);
            burgerCnt++;
            i = Math.max(i - 4, -1);
        }
    }
    
    return burgerCnt;
}