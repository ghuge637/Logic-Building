class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0,  max = 0;

       
          for(int r = 0; r<s.length();r++){  
            for(int i = l; i<r; i++){
                if(s.charAt(i) == s.charAt(r)){
                    l = i+1;
                    break;
                }
            }
             max = Math.max(max, r-l+1); 
        }

        return max;
    }
}