import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger BigInt_A = new BigInteger(a);
        BigInteger BigInt_B = new BigInteger(b);
        return BigInt_A.add(BigInt_B).toString();
    }
}