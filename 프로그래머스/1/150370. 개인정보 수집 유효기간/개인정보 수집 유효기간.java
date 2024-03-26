import java.util.ArrayList;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        int[] AtoZ = new int[26];
        
        for (String t : terms) {
            AtoZ[t.charAt(0) - 'A'] = Integer.parseInt(t.substring(2));
        }
        
        int[][] privacyArr = new int[privacies.length][3];
        int pIdx = 0;
        int sum;
        
        for (String p : privacies) {
            sum = AtoZ[p.charAt(11) - 'A'];
            
            privacyArr[pIdx][0] = Integer.parseInt(p.substring(0, 4));       // year
            privacyArr[pIdx][1] = Integer.parseInt(p.substring(5, 7)) + sum; // month
            privacyArr[pIdx][2] = Integer.parseInt(p.substring(8,10));       // day
            
            if (privacyArr[pIdx][1] > 12) {
                privacyArr[pIdx][0] += 
                    (privacyArr[pIdx][1] % 12 == 0) ? privacyArr[pIdx][1] / 12 - 1 : privacyArr[pIdx][1] / 12; 
                privacyArr[pIdx][1] = 
                    (privacyArr[pIdx][1] % 12 == 0) ? 12 : privacyArr[pIdx][1] % 12;
            }   
            pIdx++;
        }
        
        String[] todayArr = today.split("\\.");
        int aIdx = 1;
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int[] a : privacyArr) {
            if (a[0] < Integer.parseInt(todayArr[0])) {
                list.add(aIdx);
                
            } else if (a[0] == Integer.parseInt(todayArr[0]) 
                        && a[1] < Integer.parseInt(todayArr[1])) {
                list.add(aIdx);
            
            } else if (a[0] == Integer.parseInt(todayArr[0]) 
                        && a[1] == Integer.parseInt(todayArr[1])
                        && a[2] <= Integer.parseInt(todayArr[2])) {
                list.add(aIdx);
            }
            aIdx++;
        }
            
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}