class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        int size = nums.length;
        for(int i = 0; i < size; i++){
            int targetNum = target - nums[i];
            for(int j = i + 1; j < size; j++){
                if(nums[j] == targetNum){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}