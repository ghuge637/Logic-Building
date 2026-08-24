class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos = 0;
        int neg = 0;

        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                arr1[pos] = nums[i];
                pos++;
            }else{
                arr2[neg] = nums[i];
                neg++;
            }
        }

        pos = 0;
        neg = 0;

        for(int i=0; i<nums.length; i++){
            if(i%2 == 0){
                nums[i] = arr1[pos];
                pos++;
            }else{
                nums[i] = arr2[neg];
                neg++;
            }
        }

        return nums;
    }
}