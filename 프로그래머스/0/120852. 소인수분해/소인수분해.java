class Solution {
    public int[] solution(int n) {
        int length=0;
        int fakeN = n;
        for(int i = 2;i<=fakeN;i++){
            if(fakeN/i==1){
                length++;
                break;
            }
            if(fakeN%i==0&&fakeN/i%i==0){
                fakeN/=i;
                i-=1;
            }else if(fakeN%i==0){
                fakeN/=i;
                length++;
            }
            
        }
        
        int[] answer = new int[length];
        int j = 0;
        for(int i = 2;i<=n+1;i++){
            if(n/i==0){
                answer[j]+=i-1;
                break;
            }
            if(n%i==0&&n/i%i==0){
                n/=i;
                i-=1;
            }else if(n%i==0){
                n/=i;
                answer[j]+=i;
                j++;
            }
        }
        
        return answer;
    }
}