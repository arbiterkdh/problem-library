class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int idx = 0;
        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case 'S' -> {
                    continue;
                }
                case 'D' -> {
                    scores[idx-1] *= scores[idx-1];
                    continue;
                }
                case 'T' -> {
                    scores[idx-1] *= scores[idx-1] * scores[idx-1];
                    continue;
                }
                case '*' -> {
                    if (idx == 1) {
                        scores[idx-1] *= 2;
                    } else {
                        scores[idx-1] *= 2;
                        scores[idx-2] *= 2;
                    }
                    continue;
                }
                case '#' -> {
                    scores[idx-1] = -scores[idx-1];
                    continue;
                }
                
            }
            if (dartResult.charAt(i) == '1' && dartResult.charAt(i+1) == '0') {
                scores[idx] = 10;
                i++;
            } else {
                scores[idx] = dartResult.charAt(i) - '0';
            }
            idx++;
        }
    
        int sum = scores[0] + scores[1] + scores[2];
        return sum;
    }
}