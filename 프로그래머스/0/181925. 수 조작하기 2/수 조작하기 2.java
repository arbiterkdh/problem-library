class Solution {
    public String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        for(int i = 1; i<numLog.length;i++){
            switch (numLog[i]-numLog[i-1]){
                    case 1 -> sb.append("w");
                    case -1 -> sb.append("s");
                    case 10 -> sb.append("d");
                    case -10 -> sb.append("a");
            }
        }
        return sb.toString();
    }
}