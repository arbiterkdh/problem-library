class Solution {
    public int solution(int[][] lines) {
        Line line1 = new Line(lines[0][0], lines[0][1]);
        Line line2 = new Line(lines[1][0], lines[1][1]);
        Line line3 = new Line(lines[2][0], lines[2][1]);
        
        int answer = 0;
        for (int i = -100; i < 100; i++) {
            int cnt = 0;
            if (line1.hasPoint(i)) {
                cnt++;
            }
            if (line2.hasPoint(i)) {
                cnt++;
            }
            if (line3.hasPoint(i)) {
                cnt++;
            }
            
            if (cnt >= 2) {
                answer++;
            }
        }
        
        
        return answer;
    }
}

class Line {
    private int start;
    private int end;
    Line(int start, int end) {
        this.start = start;
        this.end = end;
    }
    
    public boolean hasPoint(int point) {
        return point >= start && point < end;
    }
}