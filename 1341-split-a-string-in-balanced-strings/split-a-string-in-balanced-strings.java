class Solution {
    public int balancedStringSplit(String s) {
        int c=0;int res=0;
        for(int i=0;i<s.length();i++){
            c+=s.charAt(i)=='L'?1:-1;

            if(c==0) res++;
        }
        return res;
    }
}