class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int maxlength=0;
        for(int i=0;i<n;i++){
            int currLCM=nums[i];
            int currGCD=nums[i];
            int currProduct=nums[i];

            for(int j=i+1;j<n;j++){
                currLCM=lcm(currLCM,nums[j]);
                currGCD=gcd(currGCD,nums[j]);
                currProduct*=nums[j];

                if(currProduct==currLCM*currGCD){
                    maxlength=Math.max(maxlength,j-i+1);
                }
            }

        }
        return maxlength;
    }
    public int gcd(int a,int b){
            return b==0?a:gcd(b,a%b);
        }
        public int lcm(int a,int b){
            return (a/gcd(a,b))*b;
        }

}