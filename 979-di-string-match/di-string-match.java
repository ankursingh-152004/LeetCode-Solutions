class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int left=0;
        int right=n;
       int[] ans=new int[n+1];
      for(int i=0;i<n;i++){
        if(s.charAt(i)=='I'){
            ans[i]=left;
            left++;
        }else{
            ans[i]=right;
            right--;
        }
      }
      ans[n]=left;
              return ans;
    }
}