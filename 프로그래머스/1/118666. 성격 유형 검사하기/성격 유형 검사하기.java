class Solution {
    public String solution(String[] survey, int[] choices) {
        int len = survey.length;
        int RT = 0;
        int CF = 0;
        int JM = 0;
        int AN = 0;
        
        for (int i = 0; i < len; i++) {
            switch (survey[i].charAt(0)) {
                    case 'R' -> {RT += -4 + choices[i];}
                    case 'T' -> {RT += 4 - choices[i];}
                    case 'C' -> {CF += -4 + choices[i];}
                    case 'F' -> {CF += 4 - choices[i];}
                    case 'J' -> {JM += -4 + choices[i];}
                    case 'M' -> {JM += 4 - choices[i];}
                    case 'A' -> {AN += -4 + choices[i];}
                    case 'N' -> {AN += 4 - choices[i];}    
            }
        }
        
        String personality = "";
        if (RT <= 0) {
            personality += "R";
        } else {
            personality += "T";
        }
        if (CF <= 0) {
            personality += "C";
        } else {
            personality += "F";
        }
        if (JM <= 0) {
            personality += "J";
        } else {
            personality += "M";
        }
        if (AN <= 0) {
            personality += "A";
        } else {
            personality += "N";
        }
        return personality;
    }
}