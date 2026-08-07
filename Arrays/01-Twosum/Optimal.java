import java.util.HashMap;  //using Hahsmap 

class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remain = target - nums[i];

            if (map.containsKey(remain)) {                //Time complexity = O(n)
                                                         
                return new int[]{map.get(remain), i};  // space complexity =O(n)
            }

            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
}