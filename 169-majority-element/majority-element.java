class Solution {
    public int majorityElement(int[] nums) {
        int max = 0;
        int n = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){max++;}
            }
            if(max>(nums.length/2)){
                n = i;
                break;
            }else{
                max = 0;
            }
        }
        return nums[n];
    } 
}