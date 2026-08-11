class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer,Integer>map=new HashMap<>();   //time complexity=o(n) //space complexity-o(n)


       for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);

        
       }

       for(int num:nums){
        if(map.get(num)==1){
            return num;
        }
       }
        return -1;
    }
}
View less
 

