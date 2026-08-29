class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        Arrays.sort(nums);
        
        int small = nums[0];
        int count = 1;
        int max = 1;
        

        for(int i = 1; i<nums.length; i++){
                if(nums[i]-1==small){
                    count++;
                    small = nums[i];
                }else if(nums[i] != small){
                    count = 1;
                    small = nums[i];
                }
                max = Math.max(count, max);
            } return max ;
        }
}