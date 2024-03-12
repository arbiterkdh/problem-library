class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a==b&&b==c&&c==d){
            return 1111*a;
        }
        
        if(a==b&&b==c){
            return (10*a+d)*(10*a+d);
        }else if(a==b&&b==d){
            return (10*a+c)*(10*a+c);
        }else if(a==c&&c==d){
            return (10*a+b)*(10*a+b);
        }else if(b==c&&c==d){
            return (10*c+a)*(10*c+a);
        }
        
        if(a==b&&c==d){
            return (a+c)*Math.abs(a-c);
        }else if((a==c&&b==d)||(a==d&&b==c)){
            return (a+b)*Math.abs(a-b);
        }
        
        int[] dices = {a,b,c,d};
        int min = 6;
        
        for(int i = 0;i<4;i++){
            for(int j = i+1;j<4;j++){
                if(dices[i]==dices[j]){
                    dices[i] = 1;
                    dices[j] = 1;
                    return dices[0]*dices[1]*dices[2]*dices[3];
                }
                min = min>Math.min(dices[i],dices[j]) ? Math.min(dices[i],dices[j]) : min;
            }
        }
        
        return min;
    }
}