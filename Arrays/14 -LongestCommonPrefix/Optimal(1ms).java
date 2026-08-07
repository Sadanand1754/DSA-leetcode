class Solution {
    public String longestCommonPrefix(String[] strs) {  // run time =1ms
      if(strs.length==0||strs==null){
        return "";
      }

      String word1=strs[0];

      for(int i=0;i<word1.length();i++){

        for(int j=1 ; j<strs.length;j++){   // time complexity =o(n*m)

            if(i==strs[j].length()||strs[j].charAt(i)!=word1.charAt(i)){   // space complexity =o(1)
                return word1.substring(0,i);
            }
        }
      }
      return word1;//if all prefix match....
    }
}