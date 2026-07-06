class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            elementSum+=nums[i];
            digitSum+=dSum(nums[i]);
        }
        return Math.abs(elementSum-digitSum);
    }
    public static int dSum(int i){
        int sum=0;
        while(i!=0){
            int d=i%10;
            sum+=d;
            i/=10;
        }
        return sum;
    }
}