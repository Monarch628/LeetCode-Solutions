// beats 93.68%/98.59%
class Solution {
    static int[] a;
    static int length;

    public boolean isAnagram(String s, String t) {
        length = s.length();
        a = new int[26];
        
        if(length != t.length()) {
            return false;
        }

        for(int i = 0; i < length; i++) {
            a[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < length; i++) {
            a[t.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i < 26; i++) {
            if(a[i] != 0) {
                return false;
            }
        }
        return true;
    }
}