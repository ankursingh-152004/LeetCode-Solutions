class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans=new ArrayList<>();
        pairs(ans,"",0,0,n);
        return ans;
    }
    public static void pairs(ArrayList<String> ans,String str,int open,int close,int n){
        if(str.length()==2*n){
            ans.add(str);
        }
        if(open<n){
            pairs(ans,str+"(",open+1,close,n);
        }
        if(close<open){
            pairs(ans,str+")",open,close+1,n);
        }
    }
}