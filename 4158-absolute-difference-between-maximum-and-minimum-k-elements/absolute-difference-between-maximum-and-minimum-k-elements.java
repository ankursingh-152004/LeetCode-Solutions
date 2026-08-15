class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0,s=0;
        for(int i=0,j=nums.length-1;i<k;i++,j--){
            l+=nums[j];
            s+=nums[i];
        }
        return Math.abs(l-s);
    }
}