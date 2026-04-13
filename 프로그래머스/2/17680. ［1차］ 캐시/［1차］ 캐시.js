function solution(cacheSize, cities) {    
    class LRU {
        constructor(size) {
            this.store = {};
            this.dummys = new Set();
            this.size = size;
            this.head = 0;
            this.tail = 0;
        }
        enqueue(value) {
            this.store[this.tail++] = value;
            if (this.tail - this.head - this.dummys.size > this.size) {
                this.dequeue();
            }
        }
        dequeue() {
            while (this.dummys.has(this.head)) {
                this.dummys.delete(this.head);
                this.head++;
            }
            delete this.store[this.head++];
        }
        findIndex(value) {
            for (let i = this.head; i < this.tail; i++) {
                if (value == this.store[i]) return i;
            }
            return -1;
        }
        use(idx) {
            const value = this.store[idx];
            delete this.store[idx];
            this.dummys.add(idx);
            this.enqueue(value);
        }
    }
    let timeTaken = 0;
    const cache = new LRU(cacheSize);
    for (let i = 0; i < cities.length; i++) {
        const city = cities[i].toLowerCase();
        const cityIdx = cache.findIndex(city);
        if (cityIdx > -1) {
            cache.use(cityIdx);
            timeTaken += 1;
        } else {
            cache.enqueue(city);
            timeTaken += 5;
        }
    }
    return timeTaken;
}