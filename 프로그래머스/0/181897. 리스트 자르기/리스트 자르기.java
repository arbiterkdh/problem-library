import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        int a = slicer[0] , b = slicer[1] , c = slicer[2];
        
        for(int i = a; i<=b;i+=c){
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        switch(n){
                case 1 -> answer = Arrays.copyOf(num_list,b+1);
                case 2 -> answer = Arrays.copyOfRange(num_list,a,num_list.length);
                case 3 -> answer = Arrays.copyOfRange(num_list,a,b+1);
        }
        return answer;
    }
}