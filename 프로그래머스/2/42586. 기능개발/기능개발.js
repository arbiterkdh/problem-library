function solution(progresses, speeds) {
    const distributions = [];
    for (let i = 0; i < speeds.length; i++) {
        speeds[i] = Math.ceil((100 - progresses[i]) / speeds[i]);
    }
    let idx = 0;
    distributions.push(1);
    while (idx < speeds.length - 1) {
        if (speeds[idx] >= speeds[idx + 1]) {
            speeds[idx + 1] = speeds[idx];
            distributions[distributions.length - 1]++;
        } else {
            distributions.push(1);
        }
        idx++;
    }
    return distributions;
}