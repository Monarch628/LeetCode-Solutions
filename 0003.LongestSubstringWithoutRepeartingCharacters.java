class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Current character
        char a;
        // Current substring length
        int b = 0;
        // Current longest substring length
        int c = 0;
        // Holds current substring
        StringBuilder bob = new StringBuilder("");

        for(int i = 0; i < s.length(); i++) {
            a = s.charAt(i);
            bob.append(a);
            b++;
            
            for(int j = 0; j < bob.length() - 1; j++) {
                if(a == bob.charAt(j)) {
                    if(b > c) {
                        c = b - 1;
                    }
                    bob.delete(0, j + 1);
                    b = bob.length();
                    break;
                }
            }
        }
        return (b > c) ? b : c;
    }
}