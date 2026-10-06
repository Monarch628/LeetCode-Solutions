class Solution {
    public String addBinary(String a, String b) {
        boolean overflow = false;
        StringBuilder sb = new StringBuilder("");
        int diff = a.length() - b.length();

        while(diff < 0) {
            a = "0" + a;
            diff++;
        }
        while(diff > 0) {
            b = "0" + b;
            diff--;
        }
        int i = a.length();

        while(i > 0) {
            if(Integer.parseInt(a.substring(i - 1, i)) == 0 && Integer.parseInt(b.substring(i - 1, i)) == 0) {
                if(overflow) {
                    sb.insert(0, "1");
                    overflow = false;
                }
                else {
                    sb.insert(0, "0");
                }
            }
            else if((Integer.parseInt(a.substring(i - 1, i)) == 1 && Integer.parseInt(b.substring(i - 1, i)) == 0) || (Integer.parseInt(a.substring(i - 1, i)) == 0 && Integer.parseInt(b.substring(i - 1, i)) == 1)) {
                if(overflow){
                    sb.insert(0, "0");
                }
                else {
                    sb.insert(0, "1");
                }
            }
            else {
                if(overflow) {
                    sb.insert(0, "1");
                }
                else {
                    sb.insert(0, "0");
                    overflow = true;
                }
            }
            i--;
        }
        if(overflow) {
            sb.insert(0, "1");
        }
        return sb.toString();
    }
}