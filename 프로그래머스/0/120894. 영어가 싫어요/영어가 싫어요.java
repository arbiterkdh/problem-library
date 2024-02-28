class Solution {
    public long solution(String numbers) {
        String[] strArr = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "0"   , "1"  , "2"  , "3"    , "4"   , "5"   , "6"  , "7"    , "8"    , "9"
        };
        String str = "";
        for(int i = 0; i<strArr.length/2;i++){
               str = numbers.replace(strArr[i],strArr[i+10]);
               numbers = str;
        }
        
        return Long.parseLong(numbers);
    }
}