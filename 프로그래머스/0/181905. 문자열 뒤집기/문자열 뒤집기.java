import java.util.Arrays;

class Solution {
    public String solution(String my_string, int s, int e) {
    
        if(s==e){
            return my_string;
        }
        
        String str = my_string.substring(s,e+1);
        my_string = my_string.replace(str,"+");
        String[] strArr = str.split("");
        String fake = "";
            
        for(int i=0;i<(int)(strArr.length/2);i++){
            if(i<strArr.length-i){
                fake = fake.replace(fake,strArr[strArr.length-1-i]);
                strArr[strArr.length-1-i]=strArr[strArr.length-1-i].replace(strArr[strArr.length-1-i],strArr[i]);
                strArr[i] = strArr[i].replace(strArr[i],fake);
            }
        }  
        
        
        str = String.join("",strArr);
        
        return my_string.replace("+",str);
    }
}