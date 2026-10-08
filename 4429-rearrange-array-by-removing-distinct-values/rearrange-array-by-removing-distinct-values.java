class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int[] freq=new int[101];
        for(int n:nums){
            freq[n]++;
        }
        int i=0;
        while(i<nums.length){
            for(int j=0;j<=100;j++){
                if(freq[j]>0){
                    ans[i++]=j;
                    freq[j]--;
                }
            }
        }
       return ans;
    }
}