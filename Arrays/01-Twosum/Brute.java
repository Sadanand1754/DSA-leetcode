class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
              
                if (nums[i] + nums[j] == target) {   //time comlexity= O(n²)
                                                     
                    return new int[]{i, j};   //// space complexity= O(1)
                }
            }
        }
        return new int[]{}; 
    }
}