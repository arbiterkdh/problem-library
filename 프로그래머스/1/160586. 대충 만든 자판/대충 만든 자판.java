class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] alphabet = new int[26];
        for (int i = 0; i < keymap.length; i++) {
            if (alphabet[keymap[i].charAt(0) - 'A'] == 0) {
                alphabet[keymap[i].charAt(0) - 'A'] = 1;
                continue;
            }
        }
        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                if (alphabet[keymap[i].charAt(j) - 'A'] == 0) {
                    alphabet[keymap[i].charAt(j) - 'A'] = j + 1;
                    continue;
                }
                if (alphabet[keymap[i].charAt(j) - 'A'] > j + 1) {
                    alphabet[keymap[i].charAt(j) - 'A'] = j + 1;
                }
            }
        }
        int temp = 0;
        int[] result = new int[targets.length];
        for (int i = 0; i < targets.length; i++) {
            for (int j = 0; j < targets[i].length(); j++) {
                temp = result[i];
                result[i] += alphabet[targets[i].charAt(j) - 'A'];
                if (temp == result[i]) {
                    result[i] = -1;
                    break;
                }
            }
        }
        
        return result;
    }
}