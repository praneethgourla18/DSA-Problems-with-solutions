class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(0,nums,curr,res);
        return res;
       
    }
    static void helper(int index,int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(index>=nums.length){
            res.add(new ArrayList<> (curr));
            return;
        }
        //include
        curr.add(nums[index]);
        helper(index+1,nums,curr,res);
        curr.remove(curr.size()-1);

        //exclude

        helper(index+1,nums,curr,res);
    }
}
