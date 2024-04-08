class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] students = new int[31];
        for (int i = 0; i < lost.length; i++) {
            students[lost[i]]--;            
        }
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i]]++;
        }
        
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i] == -1) {
                if (students[i - 1] == 1) {
                    students[i] = 0;
                    continue;
                } else if (i < students.length - 1 && students[i + 1] == 1) {
                    students[i] = 0;
                    students[i + 1] = 0;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i] < 0) n--;
        }
        return n;
    }
}