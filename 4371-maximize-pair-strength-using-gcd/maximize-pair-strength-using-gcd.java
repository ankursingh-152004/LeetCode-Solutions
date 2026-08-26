class Solution {
    public long maxPairStrength(int[] nums) {
        long max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
              long product = (long) nums[i] * nums[j];
long g = gcd(nums[i], nums[j]);
long strength = product / (g * g); 
max=Math.max(max,strength); 
            }
        }
        return max;
    }
    private static int gcd(int i,int j){
        int l=Math.max(i,j);
        int s=Math.min(i,j);
    while(s!=0){
        int temp=s;
        s=l%s;
        l=temp;
    }
    return l;
    }
}