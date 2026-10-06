class Solution {
    public int addDigits(int num) {
        int a = num;
        String s = "" + num;
        while(s.length() > 1) {
            s = "" + a;
            a = 0;
            for(int i = 0; i < s.length(); i++) {
                a += Integer.parseInt(s.substring(i, i + 1));
            }
        }
        return a;
    }
}