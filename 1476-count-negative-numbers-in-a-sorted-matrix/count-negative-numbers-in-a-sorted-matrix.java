class Solution {
    public int countNegatives(int[][] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length;j++){
                if(nums[i][j]<0) count++;
            }
        }
        return count;
    }
}