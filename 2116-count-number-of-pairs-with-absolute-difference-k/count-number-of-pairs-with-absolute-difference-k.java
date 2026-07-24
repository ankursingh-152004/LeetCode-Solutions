class Solution {
    public int countKDifference(int[] nums, int k) {
        int i=0;
        int c=0;
            while(i<nums.length){
                for(int j=i+1;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j])==k) c++;
                }
                i++;
            }
            return c;
    }
}