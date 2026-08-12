class Solution {
    public boolean hasDuplicate(int[] nums) {
        //int length=nums.length;

        if(nums.length<=1){
            return false;
            //break;
        }
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    return true;
                   // break;
                }
            }
        }

        return false;
    }
}