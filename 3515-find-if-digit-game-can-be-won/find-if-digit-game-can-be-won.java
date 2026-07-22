class Solution {
    public boolean canAliceWin(int[] nums) {
        int SingleSum=0;
        int DoubleSum=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]/10==0){
                SingleSum+=nums[i];
            }else{
                DoubleSum+=nums[i];
            }
        }
        return (DoubleSum!=SingleSum);
    }
   
}