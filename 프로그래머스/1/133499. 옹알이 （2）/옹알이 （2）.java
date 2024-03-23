class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for (int i = 0; i <babbling.length; i++) {
            String prev = " ";
            while (!babbling[i].isEmpty()) {
                int cnt = 0;

                if (babbling[i].startsWith("aya") && !babbling[i].startsWith(prev)) {
                    cnt++;
                    babbling[i] = babbling[i].substring(3); 
                    prev = "aya";
                } 
                if (babbling[i].startsWith("ye") && !babbling[i].startsWith(prev)) {
                    cnt++;
                    babbling[i] = babbling[i].substring(2); 
                    prev = "ye";
                } 
                if (babbling[i].startsWith("woo") && !babbling[i].startsWith(prev)) {
                    cnt++;
                    babbling[i] = babbling[i].substring(3); 
                    prev = "woo";
                } 
                if (babbling[i].startsWith("ma") && !babbling[i].startsWith(prev)) {
                    cnt++;
                    babbling[i] = babbling[i].substring(2); 
                    prev = "ma";
                }
                if (cnt == 0) break;
            }
                
            if (babbling[i].isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}