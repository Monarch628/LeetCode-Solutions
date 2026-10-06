class Solution {
    public boolean isPalindrome(int x) {
        String str = "" + x;
        int l = str.length();
        int i = 0;

        while(i < l / 2) {
            if(!str.substring(i, i + 1).equals(str.substring(l - i - 1, l - i))) {
                return false;
            }
            i++;
        }

        return true;
    }
}