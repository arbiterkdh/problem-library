class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String e:order){
            answer += e.contains("americano")||e.contains("anything") ? 4500 : 5000;
        }
        return answer;
    }
}