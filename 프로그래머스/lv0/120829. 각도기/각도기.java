class Solution {
    public int solution(int a) {

        int answer;
        if(a<90){answer=1;
                  }else if(a==90){answer=2;
                                 }else if(a<180){answer=3;
                                                   }else answer=4;
                                                  
        return answer;
    }
}