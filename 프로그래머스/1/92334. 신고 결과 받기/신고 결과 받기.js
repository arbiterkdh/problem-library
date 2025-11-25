function solution(id_list, report, k) {
    let answer = [];
    let reportEntries = [...new Set(report)].map(report => report.split(" "));
    let accusedMap = new Map();
    for (const [reporter, accused] of reportEntries) {
        accusedMap.set(accused, accusedMap.get(accused) + 1 || 1);
    }
    
    let reportMap = new Map();
    for (const [reporter, accused] of reportEntries) {
        if (accusedMap.get(accused) >= k) {
            reportMap.set(reporter, reportMap.get(reporter) + 1 || 1);
        }
    }
    
    return id_list.map(id => reportMap.get(id) || 0);
}