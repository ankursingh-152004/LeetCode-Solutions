class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=9){
                sum+=nums[i];
            }else{
                sum+=encrypt(nums[i]);
            }
        }
        return sum;
    }
    public static int encrypt(int n){
       int max=0;
       int c=0;
        while(n!=0){
            int d=n%10;
            max=Math.max(max,d);
            c++;
            n/=10;
        }
        int ans=0;
        for(int i=0;i<c;i++){
            ans=ans*10+max;
        }
        return ans;
    }
}