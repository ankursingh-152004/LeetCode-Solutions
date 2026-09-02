class Solution {
    public int generateKey(int nums1, int nums2, int nums3) {
        int ans=0;
        int p=1;
        while(nums1>0||nums2>0||nums3>0){
            int min=Math.min((nums1%10),(nums2%10));
             min=Math.min((nums3%10),(min));
             ans+=p*min;
             p*=10;
             nums1/=10;
             nums2/=10;
             nums3/=10;
        }
        return ans;
    }
}