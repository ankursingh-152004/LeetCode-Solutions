class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        while(k>=1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==minValue(nums)){
                    nums[i]=minValue(nums)*multiplier;
                    break;
                }
            }
            k--;
        }
        return nums;
    }
    public static int minValue(int[] nums){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++ ){
             min=Math.min(min,nums[i]);
        }
        return min;
    }
}