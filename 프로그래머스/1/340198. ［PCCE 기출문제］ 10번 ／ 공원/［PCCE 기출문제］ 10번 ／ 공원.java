class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        int availableSize = checkSize(park);

        for (int mat : mats) {
            if (mat <= availableSize) {
                answer = Math.max(mat, answer);
            }
        }

        return answer == 0 ? -1 : answer;
    }

    int checkSize(String[][] park) {
        int x, y, xLen = park[0].length, yLen = park.length;
        int currCheckSize = 0, availableSize = 0;

        for (y = 0; y < yLen; y++) {
            for (x = 0; x < xLen; x++) {
                if (x == 0) currCheckSize = 0;

                if (!"-1".equals(park[y][x])) {
                    currCheckSize = 0;
                    continue;
                }

                currCheckSize++;
                if (y + currCheckSize > yLen) return availableSize;

                if (currCheckSize > availableSize) {
                    int checkedX = checkPosition(x, y, currCheckSize, park);
                    if (checkedX > -1) {
                        currCheckSize = 0;
                        x = checkedX;
                    } else {
                        availableSize = currCheckSize;
                    }
                }
            }
        }
        return availableSize;
    }

    int checkPosition(int x, int y, int currCheckSize, String[][] park) {
        int checkY = y + 1;
        int checkX = x - currCheckSize + 1;
        if ((checkY > park.length) || (checkX > park[0].length)) return -1;

        for (int tmpY = checkY; tmpY < y + currCheckSize; tmpY++) {
            for (int tmpX = checkX; tmpX < x + 1; tmpX++) {
                if (!"-1".equals(park[tmpY][tmpX])) {
                    return tmpX;
                }
            }
        }
        return -1;
    }
}