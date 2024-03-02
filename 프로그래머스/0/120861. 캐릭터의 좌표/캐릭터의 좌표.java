class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(String e:keyinput){
            switch (e){
                case "left": answer[0]--; break;
                case "right": answer[0]++; break;
                case "down": answer[1]--; break;
                case "up": answer[1]++; break;
            }
            if(Math.abs(answer[0])>board[0]/2||Math.abs(answer[1])>board[1]/2){
                switch (e){
                    case "left": answer[0]++; break;
                    case "right": answer[0]--; break;
                    case "down": answer[1]++; break;
                    case "up": answer[1]--; break;
                }
            }

        }
        return answer;
    }
}