class Solution {
    public int minOperations(int[] nums, int k) {
        int c=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) c++;
        }
        return c;
    }
}