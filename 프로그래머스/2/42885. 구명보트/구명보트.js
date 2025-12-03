function solution(people, limit) {
    let boatRequires = 0;
    let currBoatWeight = 0;
    let popIdx = -1;
    
    people.sort((a, b) => a - b);
    
    while (people.length > 0) {
        currBoatWeight += people.pop();
        
        for (let i = 0; i < people.length; i++) {
            if (currBoatWeight + people[i] <= limit) {
                popIdx = i;
            } else {
                break;
            }
        }
        
        if (popIdx > -1) people.splice(popIdx, 1);
        
        boatRequires++;
        currBoatWeight = 0;
        popIdx = -1;
    }
    
    return boatRequires;
}