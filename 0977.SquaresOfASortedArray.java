class Solution {
    public int[] sortedSquares(int[] nums) {
        int p1 = 0;
        int p2 = nums.length - 1;
    
        for(int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }

        while(p2 > p1) {
            if(nums[p1] > nums[p2]) {
                int temp = nums[p1];
                nums[p1] = nums[p2];
                nums[p2] = temp;
                p2--;
            }
            else {
                p2--;
            }
        }
        return nums;
    }
}