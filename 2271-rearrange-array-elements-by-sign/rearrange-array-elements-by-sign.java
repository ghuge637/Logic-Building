class Solution {
    public int[] rearrangeArray(int[] nums) {

        int pos = 0;
        int neg = 1;

        int[] arr1 = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] > 0){
                arr1[pos] = nums[i];
                pos = pos+2;
            }else{
                arr1[neg] = nums[i];
                neg = neg+2;
            }
        }

        return arr1;
    }
}