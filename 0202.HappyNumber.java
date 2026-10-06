class Solution {    
    public boolean isHappy(int n) {
        boolean happy = false;
        String s = "" + n;
        int int1 = 0;
        int int2 = 0;
        int j = 0;
        int[] a = new int[20];
        outer: while(!happy) {
            a[j] = int1;
            int1 = 0;
            for(int i = 0; i < s.length(); i++) {
                int2 = Integer.parseInt(s.substring(i, i + 1));
                int1 += (int2 * int2);
            }

            if(int1 == 1) {
                happy = true;
                break;
            }

            for(int k = 0; k < a.length; k++){
                if(a[k] == int1) {
                    break outer;
                }
            }

            s = "" + int1;
            j++;
        }

        if(happy) {
            return true;
        }
        return false;
    }
}