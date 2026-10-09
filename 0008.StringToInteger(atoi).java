class Solution {
    static boolean isNegative;
    static StringBuilder bob;
    static int i;
    static long a;
    static int l;
    static int c = 2147483647;

    public int myAtoi(String s) {
        isNegative = false;
        bob = new StringBuilder(s.trim());
        i = 0;
        a = 0;

        if(bob.isEmpty()) {
            return 0;
        }

        if(bob.charAt(0) == '-') {
            isNegative = true;
            bob.deleteCharAt(0);
        }
        else if(bob.charAt(0) == '+') {
            bob.deleteCharAt(0);
        }

        if(bob.isEmpty() || bob.charAt(i) < '0' || bob.charAt(i) > '9') {
            return 0;
        }

        l = bob.length();
        while(i < l) {
            if(bob.charAt(i) == 48) {
                bob.deleteCharAt(i);
                l--;
            }
            else {
                break;
            }
        }

        while(i < l) {
            if(bob.charAt(i) < '0' || bob.charAt(i) > '9') {
                bob.delete(i, l);
                break;
            }
            i++;
        }

        l = bob.length();

        if(l > 10) {
            return (isNegative) ? (int)c * -1 - 1: (int)c;
        }

        for(int j = 0; j < l; j++) {
            a += ((long)Math.pow(10, (l - 1 - j)) * (bob.charAt(j) - 48));
        }

        if(isNegative) {
            a *= -1;
        }

        if(a > c - 1) {
            return (int)c;
        }
        else if(a < c * -1) { 
            return (int)(c * -1) - 1;
        }
        else {
            return (int)a;
        }
    }
}