function solution(video_len, init_pos, op_start, op_end, commands) {
    function timeToNum(str) {
        const [mm, ss] = str.split(":");
        return parseInt(ss) + (parseInt(mm) * 60);
    }

    function numToTime(sec) {
        const mm = parseInt(sec / 60);
        const ss = sec % 60;
        return `${String(mm).padStart(2, "0")}:${String(ss).padStart(2, "0")}`;
    }
    
    let len = timeToNum(video_len), 
        pos = timeToNum(init_pos), 
        start = timeToNum(op_start),
        end = timeToNum(op_end);
    
    if (start <= pos && end >= pos) pos = end;
    
    for (let command of commands) {
        switch (command) {
            case "prev":
                pos = Math.max(0, pos - 10);
                break;
            case "next":
                pos = Math.min(len, pos + 10);
                break;
        }
        
        if (start <= pos && end >= pos) pos = end;
    }
    
    return numToTime(pos);
}