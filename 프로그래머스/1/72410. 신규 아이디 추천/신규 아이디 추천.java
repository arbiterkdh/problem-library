class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase()
            .replaceAll("[^ a-z0-9_\\-.]", "")
            .replaceAll("\\.+",".")
            .replaceAll("^\\.+", "")
            .replaceAll("\\.+$", "");
        
        if (new_id.isEmpty()) {
            new_id = "a";
        } else if (new_id.length() >= 16) {
            new_id = new_id.substring(0, 15).replaceAll("\\.+$", "");
        }
        
        if (new_id.length() <= 2) {
            char c = new_id.charAt(new_id.length()-1);
            while(new_id.length() != 3) {
                new_id += c;
            }
        }
        
        return new_id;
    }
}