class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i:arr1){
            sum1+=i;
        }
        for(int i:arr2){
            sum2+=i;
        }
        //arr1이 크면 1, arr2가 크면 -1 같으면 0
        if(arr1.length > arr2.length){
            return 1;
        }else if(arr2.length > arr1.length){
            return -1;
        }else if(arr1.length == arr2.length){
            if(sum1>sum2){
                return 1;
            }else if(sum1<sum2){return -1;
                               }else{return 0;}
        }
        return 0;
    }
}