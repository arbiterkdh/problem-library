class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[2];
        int width = wallpaper[0].length();
        int height = wallpaper.length;
        int x1 = width;
        int y1 = height;
        int x2 = 0;
        int y2 = 0;
        
        for (int i = 0; i < height; i++) {
            if (wallpaper[i].contains("#")) {
                y2 = i + 1;
                if (i < y1) {
                    y1 = i;
                }
                
                for (int j = 0; j < width; j++) {
                    if (wallpaper[i].charAt(j)=='#') {
                        if (x2 < j + 1) {
                            x2 = j + 1;
                        }
                        if (j < x1) {
                            x1 = j;
                        }
                    }
                }
            }
        }
        return new int[] {y1, x1, y2, x2};
    }
}