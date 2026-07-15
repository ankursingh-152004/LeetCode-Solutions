class Solution {
    public int gcdOfOddEvenSums(int n) {
        int SumOdd=n*n;
        int SumEven=n*(n+1);
        int g=gcd(SumOdd,SumEven);
    return g;

    }
    public static int gcd(int SumOdd,int SumEven){
        int l=Math.max(SumOdd,SumEven);
        int s=Math.min(SumOdd,SumEven);
        while(s!=0){
            int temp=s;
            s=l%s;
            l=temp;
        }
        return l;
    }
}