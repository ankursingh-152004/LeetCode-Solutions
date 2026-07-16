class Solution {
    public long gcdSum(int[] nums) {
        int[] prefixGcd=new int[nums.length];
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
             mx=Math.max(mx,nums[i]);
             prefixGcd[i]=gcd(nums[i],mx);
        }
        Arrays.sort(prefixGcd);
        int i=0;
        int j=prefixGcd.length-1;
        long sum=0;
        while(i<j){
            sum+=gcd(prefixGcd[i],prefixGcd[j]);
            i++;
            j--;
        }
        return sum;
    }
    public static int gcd(int a,int b){
        int s=Math.min(a,b);
        int l=Math.max(a,b);
        while(s!=0){
            int temp=s;
            s=l%s;
            l=temp;
        }
        return l;
    }
}