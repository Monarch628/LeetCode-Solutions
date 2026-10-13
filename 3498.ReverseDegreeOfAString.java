// Beats 99.98%/68.87%
class Solution {
    // total reverse degree
    static int d;
    // length of s
    static int l;

    public int reverseDegree(String s) {
        d = 0;
        l = s.length();

        for(int i = 0; i < l; i++) {
            d += ((i + 1) * (26 - (s.charAt(i) - 97)));
        }

        return d;    
    }
}