class Solution {

    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
      
        helper(n,0,0,"",res);
        return res;
    }
    static void helper(int n,int open,int closed,String curr,List<String> res){
      
      if(closed==n){
        res.add(curr);
        return;
      }
      //pick open (
        if(open<n)
            helper(n,open+1,closed,curr+'(' ,res);
      //pick closed
     if(open>closed)
         helper(n,open,closed+1,curr+')' ,res);
    }
}
