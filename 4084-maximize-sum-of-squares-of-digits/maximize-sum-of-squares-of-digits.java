class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) return "";
        StringBuilder sb=new StringBuilder();
        while(num-->0){
            int d=Math.min(9,sum);
            sb.append(d);
            sum-=d;
        }
        return sum==0?sb.toString():"";
    }
}