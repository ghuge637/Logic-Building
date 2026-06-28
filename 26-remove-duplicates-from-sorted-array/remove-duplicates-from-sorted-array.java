class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int pre = 0;
        // int post = 1;

        for(int i=1; i<nums.length; i++){
            if(nums[pre]!=nums[i]){
                nums[pre+1] = nums[i];
                pre++;
            }
        }
        return pre+1;
    }
}