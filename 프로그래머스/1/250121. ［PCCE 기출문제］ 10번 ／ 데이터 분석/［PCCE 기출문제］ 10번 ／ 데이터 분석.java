import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] arr = {"code", "date", "maximum", "remain"};
        List<String> list = Arrays.asList(arr);
        int extIdx = list.indexOf(ext);
        int sortIdx = list.indexOf(sort_by);
        
        return Arrays.stream(data).filter(o -> o[extIdx] < val_ext)
            .sorted((o1, o2) -> o1[sortIdx] - o2[sortIdx]).toArray(int[][]::new);
    }
}