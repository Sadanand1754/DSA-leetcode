class Solution {
    public int[] plusOne(int[] digits) {
         
          int s=digits.length;

          for(int i=s-1;i>=0;i--){  // time complexity =o(n)
          
            if(digits[i]<9){
               digits[i]++;
               return digits;
            }
            digits[i]=0;
          }
          int result[]=new int [s+1];
          result[0]=1;
          return result;
          
    }
}