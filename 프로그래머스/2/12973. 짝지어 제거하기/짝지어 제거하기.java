import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack stack = new Stack();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.peek().equals(s.charAt(i))) {
                stack.pop();
                continue;
            }
            stack.push(s.charAt(i));
        }
        return stack.isEmpty() ? 1 : 0;
    }
}