import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.range(2, n).filter(o -> n % o == 1).findFirst().orElse(0);
    }
}