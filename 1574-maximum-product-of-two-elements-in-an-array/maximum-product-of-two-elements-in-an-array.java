class Solution {
    public int maxProduct(int[] nums) {
        // int m1=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j) continue;
        //     if((nums[i]-1)*(nums[j]-1)>=m1){
        //         m1=(nums[i]-1)*(nums[j]-1);
        //     }
        // }
        // }
        // return m1;
        //Second method
         int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num >= max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
    }
