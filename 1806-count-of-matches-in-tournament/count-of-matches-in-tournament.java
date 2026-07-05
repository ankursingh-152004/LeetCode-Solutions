class Solution {
    public int numberOfMatches(int n) {
        int matches=0;
        int sum=0;
        while(n>1){
        if(n%2==0){
            matches=n/2;
            sum+=matches;
        }
        else{
            matches=(n-1)/2;
            sum+=matches;

        }
        n=n-matches;
        }
        return sum;
    }
}