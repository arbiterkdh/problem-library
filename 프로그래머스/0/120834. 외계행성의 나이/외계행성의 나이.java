class Solution {
    public String solution(int age) {
        String answer = "";
        String str = Integer.toString(age);
        String[] strArr = str.split("");
        int[] intArr = new int[strArr.length];
        char[] chArr = new char[strArr.length];
        
        for(int i = 0; i<strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
            chArr[i] = (char)(intArr[i]+97);
            strArr[i] = Character.toString(chArr[i]);
            answer+= strArr[i];
        }
        return answer;
    }
}