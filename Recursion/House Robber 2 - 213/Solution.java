class Solution {
    public int rob(int[] nums) {
          if(nums.length == 1) return nums[0];
        return Math.max(helper(0,nums,nums.length-1),helper(1,nums,nums.length));
        }
     static int helper(int index,int[] nums,int end){
      if(index>=end){
        return 0;
      }
      int rob=nums[index]+helper(index+2,nums,end);
      int unrob=helper(index+1,nums,end);
      return Math.max(rob,unrob);
    }
}
