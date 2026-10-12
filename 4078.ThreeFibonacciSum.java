// Beats 99.56%/92.95%
class Solution {
    static int f1;
    static int f2;
    static int f3;
    static int f4;
    static int s;
    public boolean threeFibonacciSum(int n) {
        f1 = 0;
        f2 = 1;
        f3 = 1;
        while(true) {
            s = f1 + f2 + f3;
            if(n == s) {
                return true;
            }
            else if(n < s) {
                return false;
            }
            f4 = f3 + f2;       
            f1 = f2;
            f2 = f3;
            f3 = f4;
        }   
    }
}