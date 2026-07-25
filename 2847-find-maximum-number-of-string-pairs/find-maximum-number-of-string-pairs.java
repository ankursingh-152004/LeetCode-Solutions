class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
      int c=0;
      boolean[] vis=new boolean[words.length];
       for(int i=0;i<words.length;i++){
        if(vis[i]) continue;
        for(int j=i+1;j<words.length;j++){
            if(vis[j]) continue;
            if(rev(words[i],words[j])) {
                c++;
                vis[i]=true;
                vis[j]=true;
                break;
            }
        }
       }
       return c;
    }
    public static boolean rev(String s1,String s2){
        int i=0;
        int j=s2.length()-1;
        while(j>=0 && i<s1.length()){
            if(s1.charAt(i)!=s2.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}