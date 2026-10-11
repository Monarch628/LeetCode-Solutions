// beats 99.85% of memory
class Solution {
    // length of strs array
    static int l1;
    // current prefix
    static StringBuilder bob;
    // length of prefix
    static int l2;
    // current String
    static String s;
    // length of current string
    static int l3;
    // current char
    static int j;

    public String longestCommonPrefix(String[] strs) {
        l1 = strs.length;
        bob = new StringBuilder(strs[0]);
        l2 = bob.length();

        for(int i = 1; i < l1; i++) {
            if(bob.isEmpty()) {
                return "";
            }
            // setup for next String
            s = strs[i];
            l3 = s.length();
            j = 0;
            // compare each character in sequence
            while(j < l2 && j < l3) {
                if(bob.charAt(j) != s.charAt(j)) {
                    bob.delete(j, l2);
                    l2 = bob.length();
                    break;
                }
                j++;
            }
            // if second String is shorter than the first, delete difference
            if(j - 1 < l3) {
                bob.delete(j, l2);
                l2 = bob.length();
            }
        }    
        return bob.toString();
    }
}