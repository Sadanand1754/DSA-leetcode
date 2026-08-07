class Solution {
    public String longestCommonPrefix(String[] strs) { // much better way run time= 0ms
        if (strs == null || strs.length == 0) {
            return "";
        }
        String first = strs[0];

        for (int i = 1; i < strs.length; i++) {  

            while (!strs[i].startsWith(first)) {
                first = first.substring(0, first.length() - 1);
                if (first.isEmpty()) {
                    return "";
            }
        }
        }

        return first;
    }
} 