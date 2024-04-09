class Solution {
    public int[] solution(String[] park, String[] routes) {
        boolean[][] block = new boolean[park.length][park[0].length()];
        int[] point = new int[2];
        
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    point[0] = i;
                    point[1] = j;
                }
                else if (park[i].charAt(j) == 'X') block[i][j] = true;
            }
        }
        
        for (String route : routes) {
            int[] temp = new int[2];
            temp[0] = point[0];
            temp[1] = point[1];
            
            switch (route.charAt(0)) {
                case 'E' -> {
                    for (int i = 0; i < route.charAt(2) - '0'; i++) {
                        if (temp[1] == park[0].length() - 1) break;
                        if (!block[temp[0]][temp[1] + 1]) {
                            temp[1]++;
                        }
                    }
                    if (temp[1] == point[1] + (route.charAt(2) - '0')) {
                        point[1] = temp[1];
                    }
                    break;
                }
                case 'W' -> {
                    for (int i = 0; i < route.charAt(2) - '0'; i++) {
                        if (temp[1] == 0) break;
                        if (!block[temp[0]][temp[1] - 1]) {
                            temp[1]--;
                        }
                    }
                    if (temp[1] == point[1] - (route.charAt(2) - '0')) {
                        point[1] = temp[1];
                    }
                    break;
                }
                case 'S' -> {
                    for (int i = 0; i < route.charAt(2) - '0'; i++) {
                        if (temp[0] == park.length - 1) break;
                        if (!block[temp[0] + 1][temp[1]]) {
                            temp[0]++;
                        }
                    }
                    if (temp[0] == point[0] + (route.charAt(2) - '0')) {
                        point[0] = temp[0];
                    }
                    break;
                }
                case 'N' -> {
                    for (int i = 0; i < route.charAt(2) - '0'; i++) {
                        if (temp[0] == 0) break;
                        if (!block[temp[0] - 1][temp[1]]) {
                            temp[0]--;
                        }
                    }
                    if (temp[0] == point[0] - (route.charAt(2) - '0')) {
                        point[0] = temp[0];
                    }
                }
            }
        }
        return point;
    }
}