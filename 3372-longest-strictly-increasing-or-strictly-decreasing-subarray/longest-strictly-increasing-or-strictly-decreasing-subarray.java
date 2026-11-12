class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest=1,inc=1,dec=1;
        for(int i=1;i<nums.length;i++){
            inc=nums[i-1]<nums[i]?inc+1:1;
            dec=nums[i-1]>nums[i]?dec+1:1;
            longest=Math.max(longest,Math.max(inc,dec));
        }
        return longest;
    }
}