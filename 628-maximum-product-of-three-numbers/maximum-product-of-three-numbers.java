class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[0]*nums[1]*nums[n-1]);




        // int m1=Integer.MIN_VALUE;
        // int m2=Integer.MIN_VALUE;
        // int m3=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     if(m1<=nums[i]){
        //         int temp=m1;
        //         m1=nums[i];
        //         m3=m2;
        //         m2=temp;
        //     }
        //     else if(m2<=nums[i]){
        //         int t=m2;
        //         m2=nums[i];
        //         m3=t;
        //     }
        //     else if(m3<nums[i]){
        //         m3=nums[i];
        //     }
        // }
        // return m1*m2*m3;
    }
}