class Solution {
    public int maxProduct(int[] nums) {
        int m1=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
            if((nums[i]-1)*(nums[j]-1)>=m1){
                m1=(nums[i]-1)*(nums[j]-1);
            }
        }
        }
        return m1;
    }
}