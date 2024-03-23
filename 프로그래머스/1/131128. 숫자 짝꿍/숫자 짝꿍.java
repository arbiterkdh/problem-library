import java.util.Arrays;
class Solution {
    public String solution(String X, String Y) {
        char[] caX = X.toCharArray();
        char[] caY = Y.toCharArray();
        
        Arrays.sort(caX);
        Arrays.sort(caY);
        
        int[] pairs = new int[10];
        
        int xNum = 0;
        int yNum = 0;
        int pairCnt = 0;
        while (xNum < caX.length && yNum < caY.length) {
            if (caX[xNum] == caY[yNum]) {
                pairs[caX[xNum]-'0']++;
                xNum++;
                yNum++;
                pairCnt++;
            } else if(caX[xNum] > caY[yNum]) {
                yNum++;
            } else {
                xNum++;
            }
        }
        
        if (pairCnt == 0) return "-1";
        
        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            while (pairs[i] > 0) {
                sb.append(i);
                pairs[i]--;
            }
        }
        
        String answer = sb.toString();
        
        if (answer.startsWith("0")) {
            return "0";
        }
        
        return answer;
    }
}