class Solution {
    public int partitionArray(int[] nums, int k) {
        int c=1;
        Arrays.sort(nums);
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[j]-nums[i]>k){
                c++;
                i=j;
            }
            j++;
        }
        return c;
    }
}