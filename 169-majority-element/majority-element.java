class Solution {
    public int majorityElement(int[] nums) {
        int popular=nums[0];
        int count=0;
        for(int i=0;i<nums.length-1;i++){
          int  temp=nums[i];
           int tempCount=0;
            for(int j=i+1;j<nums.length;j++){
                if(temp==nums[j]){
                    tempCount++;
                }
            }
            if(tempCount>count){
                popular=temp;
                count=tempCount;
            }
        }
        return popular;
    }
}