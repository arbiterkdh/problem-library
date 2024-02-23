class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int sum = 0;
        for(int a:sides){
            sum+=a;
        }
        for(int i=0;i<sides.length;i++){
            if(sides[i]<sum-sides[i]){
                answer += 1;
            }else{answer += 2;
                 }
        }
        if(answer%2==0){answer=2;}else{answer=1;};

        return answer;
    }
}