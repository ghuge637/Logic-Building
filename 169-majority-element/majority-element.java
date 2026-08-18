class Solution {
    public int majorityElement(int[] nums) {
         int el = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            
            if(count == 0){
                el = nums[i];
                count = 1;
            }
            else if(el == nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
 
        int cot = 0;
        for(int i=0; i<nums.length; i++){
            if(el==nums[i]) cot++;
        }
        
        if(cot>(nums.length/2)){
            return el;
        }
        return -1;
    } 
}