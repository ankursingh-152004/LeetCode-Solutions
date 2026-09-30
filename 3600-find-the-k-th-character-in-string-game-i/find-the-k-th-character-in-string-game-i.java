class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb=new StringBuilder("a");
        while(sb.length()<k){
            int n=sb.length();
            for(int i=0;i<n;i++){
                char c=sb.charAt(i);
                if(c=='z'){
                    sb.append("a");
                }else{
                    sb.append((char)(c+1));
                }
            }
        
        }
        return sb.charAt(k-1);
    }
}