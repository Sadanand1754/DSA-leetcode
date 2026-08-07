class Solution {


    
    public int removeDuplicates(int[] nums) {  // two pinter
        int slow =0;
     
        for(int fast =1;fast<nums.length;fast++){ // time complexity =O(n)

        if(nums[slow]!=nums[fast]){   // space complexity =o(1)

            slow ++;
            nums[slow]=nums[fast];
        }
        }
        return slow +1;
    }
}