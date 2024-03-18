class Solution {
    public List<List<Integer>> combine(int n, int k) {
        ArrayList<Integer> curr=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(n,k,1,curr,res);
        return res;
    }
    static void helper(int n,int k, int i,List<Integer> curr, List<List<Integer>> res){
       if(curr.size()==k){
         res.add(new ArrayList<>(curr));
         return;
       }
    
        if(i>n){
            return;
        }
        //included

        curr.add(i);
        helper(n,k,i+1,curr,res);
        curr.remove(curr.size()-1);

        //exclude
        helper(n,k,i+1,curr,res);
    }
}
