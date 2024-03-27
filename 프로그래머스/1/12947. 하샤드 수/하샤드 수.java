class Solution {
    public boolean solution(int x) {
        int sum = String.valueOf(x).chars().map(o -> o - '0').sum();
        return x % sum == 0 ;
    }
}