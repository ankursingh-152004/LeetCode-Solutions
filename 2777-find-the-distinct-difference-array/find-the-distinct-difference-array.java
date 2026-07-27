class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int[] ans=new int[nums.length];
        HashSet<Integer> pre=new HashSet<>();

        for(int i=0;i<nums.length;i++){
        pre.add(nums[i]);
        HashSet<Integer> suf=new HashSet<>();

        for(int j=i+1;j<nums.length;j++){

            suf.add(nums[j]);
        }
        ans[i]=pre.size()-suf.size();
        }
        return ans;
    }
}