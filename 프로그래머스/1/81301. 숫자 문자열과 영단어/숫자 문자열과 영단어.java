class Solution {
    public int solution(String s) {
        String[] numbers = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i =0;i<10;i++){
            if(s.contains(numbers[i])){
                s = s.replace(numbers[i],i+"");
            }
        }
        int answer = Integer.parseInt(s);
        return answer;
    }
}