class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int ans=0;
        for(char c:s.toCharArray()){
            if(c==')'){
                depth--;
                continue;
            }
            if(c!='('){
                continue;
            }
            depth++;
            if(depth>ans) {
                ans=depth;
            }
        }
        return ans;
    }
}