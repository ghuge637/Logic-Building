class Solution {
    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^A-Za-z0-9]", "");

        result = result.toLowerCase();
        int start = 0, end = result.length()-1;
        boolean flag = false;

        if(result.length()<2) return true;

        while(start<end){
            if(result.charAt(start) == result.charAt(end)){
                flag = true;
                start++;
                end--;
            } else {
                return flag = false;
            }
        }

        return flag;
    }
}