function solution(schedules, timelogs, startday) {
    var answer = 0;
    schedules = schedules.map(schedule => {
        schedule += 10;
        if (schedule % 100 > 59) {
            schedule += 40;
        }
        return schedule;
    });
    
    for (let i = 0; i < schedules.length; i++) {
        let isLate = false;

        for (let day = 0; day < 7; day++) {
            let checkWeekend = (day + startday) % 7;
            if (checkWeekend == 6 || checkWeekend == 0) continue;
            
            if (timelogs[i][day] > schedules[i]) {
                isLate = true;
                break;
            }
        }
        
        if (!isLate) {
            answer++;
        }
    }
    
    return answer;
}