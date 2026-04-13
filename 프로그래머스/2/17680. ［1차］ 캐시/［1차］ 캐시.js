function solution(cacheSize, cities) {
    let timeTaken = 0;
    const cache = new Map();
    for (let i = 0; i < cities.length; i++) {
        const city = cities[i].toLowerCase();
        if (cache.has(city)) {
            timeTaken++;
            cache.delete(city);
            cache.set(city);
        } else {
            timeTaken += 5;
            cache.set(city);
            if (cache.size > cacheSize) {
                cache.delete(cache.keys().next().value);
            }
        }
    }
    return timeTaken;
}