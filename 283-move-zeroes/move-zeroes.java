class Solution {
    public void moveZeroes(int[] nums) {
        int back = 0;
        int front = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[front] == 0){
                front++;
            } else{
                nums[back] = nums[front];
                front++;
                back++;
            }
        }

        for(int i = back; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}