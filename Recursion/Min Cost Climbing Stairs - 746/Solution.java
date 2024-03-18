class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int index=0;
        return Math.min(helper(index,cost),helper(index+1,cost)) ;
    }
    static int helper(int index,int[] cost){
      if(index>=cost.length){
        return 0;
      }
      return cost[index] + Math.min(helper(index+1,cost),helper(index+2,cost));
    }
  
}
