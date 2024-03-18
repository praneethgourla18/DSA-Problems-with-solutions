class Solution {

    public int rob(int[] nums) {
        int index=0;
        return helper(index,nums);
    }
    static int helper(int index,int[] nums){

        if(index>=nums.length){
            return 0;
        }
       int rob=nums[index]+helper(index+2,nums);
       int dontrob=helper(index+1,nums);

       return Math.max(rob,dontrob);
    }
}
