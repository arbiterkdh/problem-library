class Solution {
    public int solution(String binomial) {
        String[] binoArr = binomial.split(" ");
        binomial = binoArr[1]; //operand 로 바꿈.
        int a = Integer.parseInt(binoArr[0]);
        int b = Integer.parseInt(binoArr[2]);
        return binomial.equals("+") ? a+b : binomial.equals("-") ? a-b : a*b;
    }
}