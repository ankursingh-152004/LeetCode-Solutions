class Solution {
    public int minimumPrefixLength(int[] nums) {
        for(int j=nums.length-2;j>=0;j-- ){
            if(nums[j]>=nums[j+1]) return j+1;
        }
        return 0;
    }
}