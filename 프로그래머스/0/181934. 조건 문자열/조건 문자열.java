class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        String str = eq.equals("!") ? ineq : ineq+eq ;
        return (n==m && str.contains("=")) || (n>m && str.contains(">")) || (n<m && str.contains("<"))? 1 : 0;
    }
}