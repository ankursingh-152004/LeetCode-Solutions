class Solution {
    public long maxAlternatingSum(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]*nums[i];
        }
        Arrays.sort(arr);
        int k=nums.length/2;
        long sum=0;
        for(int i=0;i<k;i++){
            sum-=arr[i];
        }
        for(int i=k;i<nums.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}