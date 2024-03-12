class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuilder sb = new StringBuilder(picture[0].length()*k);
        String[] answer = new String[picture.length*k];
        int x = 0;
        
        for(int i = 0; i<picture.length;i++){
            for(int j = 0; j<picture[0].length();j++){
                for(int l = 0; l<k ; l++){
                    sb.append(picture[i].charAt(j));
                }
            }
            for(int l = 0; l<k ; l++){
                answer[x] = sb.toString();
                x++;
            }
            sb.delete(0,sb.length());
        }
        return answer;
    }
}