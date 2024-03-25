import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        DataAnalyze analyze = new DataAnalyze(data, ext, sort_by);
        Map<Integer, int[]> map = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (analyze.standardize(i) < val_ext) {
                map.put(data[i][analyze.sortBy()], data[i]);
            }
        }

        int[][] answer = new int[map.size()][4];
        List<Integer> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        int idx = 0;
        for (Integer key : keySet) {
            answer[idx] = map.get(key);
            idx++;
        }

        return answer;

    }
    
}
class DataAnalyze {

    private String ext;
    private int[][] data;
    private String sort_by;

    public DataAnalyze (int[][] data, String ext, String sort_by){
        this.data = data;
        this.ext = ext;
        this.sort_by = sort_by;
    }

    public int standardize(int i) {

        switch (this.ext) {
            case "code" -> {
                return data[i][0];
            }
            case "date" -> {
                return data[i][1];
            }
            case "maximum" -> {
                return data[i][2];
            }
            case "remain" -> {
                return data[i][3];
            }
        }
        return 0;
    }

    public int sortBy() {
        switch (this.sort_by) {
            case "code" -> {
                return 0;
            }
            case "date" -> {
                return 1;
            }
            case "maximum" -> {
                return 2;
            }
            case "remain" -> {
                return 3;
            }
        }
        return 0;
    }
}