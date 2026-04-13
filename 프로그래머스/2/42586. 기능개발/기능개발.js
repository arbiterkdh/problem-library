function solution(progresses, speeds) {
    const distributions = [];
    for (let i = 0; i < speeds.length; i++) {
        speeds[i] = Math.ceil((100 - progresses[i]) / speeds[i]);
    }
    distributions.push(1);
    for (let i = 0; i < speeds.length - 1; i++) {
        if (speeds[i] >= speeds[i + 1]) {
            speeds[i + 1] = speeds[i];
            distributions[distributions.length - 1]++;
        } else {
            distributions.push(1);
        }
    }
    return distributions;
}