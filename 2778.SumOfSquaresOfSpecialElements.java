//beats 100% of runtime
class Solution {
    // sum of squares of all special elements
    static int a;
    // length of nums[]
    static int l;
    // number at nums[i]
    static int s;

    public int sumOfSquares(int[] nums) {
        a = 0;
        l = nums.length;
        
        for(int i = 0; i < l; i++) {
            if(l % (i + 1) == 0) {
                s = nums[i];
                a += s * s;
            }
        }    
        return a;
    }
}