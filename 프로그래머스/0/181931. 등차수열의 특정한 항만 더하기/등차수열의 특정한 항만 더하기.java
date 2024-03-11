class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] numbers = new int[included.length];
        numbers[0] = a;
        for(int i=0;i<included.length;i++){
            numbers[i] = included[i]==true ? a+i*d : 0;
            answer+=numbers[i];
        }
        return answer;
    }
}