class Solution {
    public int majorityElement(int[] nums) {
        int value = nums[0];
        int iRep = 0;
        for(int i = 1; i < nums.length; i ++) {
            if(nums[i] == value) { iRep++; }
            else {
                iRep--;
                if(iRep < 0) {
                    value = nums[i];
                    iRep = 0;
                }
            }
        }
        return value;
    }
}