class Solution {
    public int[] solution(int N, int[] stages) {
        int[] stageCnt = new int[N], sortedArr = new int[N];
        double[] failureRatio = new double[N];
        int i, passed = 0;
        
        for (i = 0; i < stages.length; i++) {
            if (stages[i] <= N) stageCnt[stages[i] - 1]++;
            else passed++;
        }
        if (passed != 0 || stageCnt[N - 1] != 0) {
            failureRatio[N - 1] = stageCnt[N - 1] / (double) (stageCnt[N - 1] + passed);
            stageCnt[N - 1] += passed;
        }
        for (i = N - 2; i >= 0; i--) 
            if (stageCnt[i] != 0 || stageCnt[i + 1] != 0) {
                failureRatio[i] = stageCnt[i] / (double) (stageCnt[i] + stageCnt[i + 1]);
                stageCnt[i] += stageCnt[i + 1];
            }
        
        for (i = 0; i < N; i++) sortedArr[i] = i + 1;
        
        for (i = 0; i < N - 1; i++)
            for (int j = i + 1; j < N; j++) {
                if (failureRatio[i] < failureRatio[j]) {
                    double swap = failureRatio[i];
                    failureRatio[i] = failureRatio[j];
                    failureRatio[j] = swap;
                    int swap2 = sortedArr[i];
                    sortedArr[i] = sortedArr[j];
                    sortedArr[j] = swap2;
                    
                } else if (failureRatio[i] == failureRatio[j]) 
                    if (sortedArr[i] > sortedArr[j]) {
                        int swap = sortedArr[i];
                        sortedArr[i] = sortedArr[j];
                        sortedArr[j] = swap;
                    }
            }

        return sortedArr;
    }
}
