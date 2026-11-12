class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        if(k==0) return new int[n];
        int i,j;
        if(k<0){
           i=(n+k)%n;
           j=n-1;
        }else{
            i=1;
            j=k;
        }
    int sum=0;
    for(int t=i;t<=j;t++){
        sum+=code[t];
    }
    int[] ans=new int[n];
    for(int a=0;a<code.length;a++){
        ans[a]=sum;
        sum-=code[i];
        i=(i+1)%n;
        j=(j+1)%n;
        sum+=code[j];
    }
    return ans;
    }
}