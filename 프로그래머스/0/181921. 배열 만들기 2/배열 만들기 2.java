import java.util.ArrayList;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        l = l%10>5 ? l-l%10+10 : l-l%10+5;
        for(int num=l ; num<=r ; num+=5){
            int temp = num;
            boolean isZeroFive = true;
            while(temp>0){
                if(temp%10!=0 && temp%10!=5){
                    isZeroFive = false;
                    break;
                }
                temp/=10;
            }
            if(isZeroFive)list.add(num);
            
        }
        
        int[] answer = new int[list.size()];
        if(list.isEmpty()) answer = new int[]{-1};
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}