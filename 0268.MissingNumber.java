class Solution {
    public int missingNumber(int[] nums) {
        boolean found = false;
        int i = 0;
        int n = nums.length;
        while(i <= n) {
            found = false;
            for(int j = 0; j < n; j++) {
                if(nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                break;
            }
            i++;
        }

        return i;
    }
}