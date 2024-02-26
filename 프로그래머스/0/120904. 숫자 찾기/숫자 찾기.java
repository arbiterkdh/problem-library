class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str = Integer.toString(num);
        String strOne = Integer.toString(k);
        String[] strArr = str.split("");
        for(int i=0;i<strArr.length;i++){
            if(strArr[i].equals(strOne)){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}