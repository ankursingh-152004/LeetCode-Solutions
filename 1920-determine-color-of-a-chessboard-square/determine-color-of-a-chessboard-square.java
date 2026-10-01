class Solution {
    public boolean squareIsWhite(String coordinates) {
        int sum=0;

            int c1=coordinates.charAt(0)-'a';
            int c2=coordinates.charAt(1)-'0';
            sum+=c1+c2;
            return sum%2==0?true:false;
    }
}