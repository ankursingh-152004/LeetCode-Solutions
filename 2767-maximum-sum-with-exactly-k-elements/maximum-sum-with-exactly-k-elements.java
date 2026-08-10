class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int m:nums){
            max=Math.max(max,m);
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=max;
            max++;
        }
        return sum;
    }
}