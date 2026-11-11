class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
      long c1=cost1,c2=cost2,cb=costBoth;
      long n1=need1,n2=need2;
      long minNeed=Math.min(n1,n2);
      long minCost=minNeed*Math.min(cb,c1+c2);
      long rem1=n1-minNeed;
      long rem2=n2-minNeed;
      long restCost=rem1*Math.min(cb,c1)+rem2*Math.min(cb,c2);

      return minCost+restCost;
    }
}