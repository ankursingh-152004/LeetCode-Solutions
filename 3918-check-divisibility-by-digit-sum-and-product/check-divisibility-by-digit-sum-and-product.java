class Solution {
    public boolean checkDivisibility(int n) {
        int sum=overallSum(n);
        return (n%sum==0)?true:false;
    }
    private static int overallSum(int n){
        int s=0;
        int p=1;
        while(n!=0){
            int d=n%10;
            s+=d;
            p*=d;
            n/=10;
        }
        return s+p;
    }
}