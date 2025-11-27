function solution(friends, gifts) {
    let maxGiftBackCnt = 0;
    
    let giftRecords = new Map();
    let giftScoreRecords = new Map();
    for (let record of gifts) {
        giftRecords.set(record, (giftRecords.get(record)??0)+1);
        
        let [p1, p2] = record.split(" ");
        giftScoreRecords.set(p1, (giftScoreRecords.get(p1)??0)+1);
        giftScoreRecords.set(p2, (giftScoreRecords.get(p2)??0)-1);
    }
    
    let giveAndTakeRecords = new Map();
    for (let i = 0; i < friends.length - 1; i++) {
        for (let j = i + 1; j < friends.length; j++) {
            let p1Score = giftRecords.get(friends[i] + " " + friends[j])||0;
            let p2Score = giftRecords.get(friends[j] + " " + friends[i])||0;
            
            if (p1Score > p2Score) {
                giveAndTakeRecords.set(friends[i], (giveAndTakeRecords.get(friends[i])??0)+1);
            } else if (p1Score < p2Score) {
                giveAndTakeRecords.set(friends[j], (giveAndTakeRecords.get(friends[j])??0)+1);
            } else if (p1Score == p2Score) {
                let p1GiftScore = giftScoreRecords.get(friends[i])||0;
                let p2GiftScore = giftScoreRecords.get(friends[j])||0;
                
                if (p1GiftScore > p2GiftScore) {
                    giveAndTakeRecords.set(friends[i], (giveAndTakeRecords.get(friends[i])??0)+1);
                } else if (p1GiftScore < p2GiftScore) {
                    giveAndTakeRecords.set(friends[j], (giveAndTakeRecords.get(friends[j])??0)+1);
                }
            }
        }
    }
    
    giveAndTakeRecords.forEach(score => {
        maxGiftBackCnt = Math.max(maxGiftBackCnt, score);
    });
    
    return maxGiftBackCnt;
}