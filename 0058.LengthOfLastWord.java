class Solution {
    public int lengthOfLastWord(String s) {
        int location = 0;
        int length = s.length();

        while(s.substring(length - 1, length).equals(" ")) {
            s = s.substring(0, length - 1);
            length = s.length();
        }

        for(int i = length; i > 0; i--) {
            if(s.substring(i - 1, i ).equals(" ")) {
                location = i;
                break;
            }
        }
        return length - location;
    }
}