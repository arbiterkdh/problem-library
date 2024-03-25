import java.util.stream.IntStream;

class Solution {
    public int solution(String my_string, String is_prefix) {
        return IntStream.rangeClosed(0, my_string.length())
            .mapToObj(i -> my_string.substring(0, i))
            .anyMatch(s -> s.equals(is_prefix)) ? 1 : 0;
    }
}