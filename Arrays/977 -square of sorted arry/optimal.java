class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int []square = new int[n];

        int left =0;    // teo pointeer // optimal way
        int right = n-1;
        int index=n-1;
        while( left<=right){     

            if(nums[left]*nums[left]>nums[right]*nums[right]){  // time complexity =o(n)
                square[index]=nums[left]*nums[left];
                left ++;
                
            }
            else{
                square[index]=nums[right]*nums[right];
                right--;
            }
            index --;
        }
        return square;
        
    }
}