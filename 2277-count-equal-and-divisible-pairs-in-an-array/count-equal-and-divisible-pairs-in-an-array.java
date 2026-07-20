class Solution {
    public int countPairs(int[] nums, int k) {
        int c=0;
        int j;
        for(int i=0;i<nums.length-1;i++){
              j=i+1;
              while(j<nums.length){
                if((i*j)%k==0){
                   if(nums[i]==nums[j]){
                    c++;
                    }
                }
                j++;
              } 
        }
        return c;
    }
}