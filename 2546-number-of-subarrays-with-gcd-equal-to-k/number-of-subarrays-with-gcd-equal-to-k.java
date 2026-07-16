class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int g=0;
            for(int j=i;j<nums.length;j++){
            g=gcd(g,nums[j]);
            if(g==k)
             {
                c++;
            }else if(g<k) break;
        }
        }
        return c;
    }
    public static int gcd(int a,int b){

        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}