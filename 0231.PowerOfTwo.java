class Solution {
    public boolean isPowerOfTwo(int n) {

        int a = 1;
        for(int i = 0; i < 31; i++) {
            if (a == n){
                return true;
            }
            a *= 2;
        }
        return false;
    }
}