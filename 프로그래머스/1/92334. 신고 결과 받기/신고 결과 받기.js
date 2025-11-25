function solution(id_list, report, n) {
    let answer = [];
    const reducedReport = report.reduce((acc, curr) => {
        let [k, v] = curr.split(" ");
        if (acc[v] == undefined) {
            acc[v] = [];
        }
        if (!acc[v].includes(k)) {
            acc[v].push(k);
        }
        return acc;
    }, {});
    
    const reducedIdList = id_list.reduce((acc, id) => {
        if (reducedReport[id]?.length >= n) {
            reducedReport[id].forEach(reporter => {
               acc[reporter] = (acc[reporter] ?? 0) + 1;
            });
        }
        return acc;
    }, {});
    
    for (let id of id_list) answer.push(reducedIdList[id] ?? 0);
    
    return answer;
}