class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int start = 0, end = result.length()-1;
        if(result.length()<2) return true;

        while(start<end){
            if(result.charAt(start) != result.charAt(end)){
                return false; 
            } else {
                start++;
                end--;
            }
        }

        return true;
    }
}