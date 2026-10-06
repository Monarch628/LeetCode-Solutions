class Solution {
    public int reverse(int x) {
        String stringX = "" + x;
        int length = stringX.length();
        StringBuilder sb = new StringBuilder("");

        if(stringX.substring(0,1).equals("-")) {
            stringX = stringX.substring(1, length) + "-";
        }

        for(int i = length; i > 0; i--) {
            sb.append(stringX.substring(i - 1, i));
        }

        try{
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}