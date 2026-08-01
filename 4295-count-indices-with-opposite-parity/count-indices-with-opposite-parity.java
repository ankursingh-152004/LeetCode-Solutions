class Solution {
    public int[] countOppositeParity(int[] nums) {
        int[] answer=new int[nums.length];
        int even=0;
        int odd=0;
        for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0){
                    even++;
                }else{
                    odd++;
                }
        }
        for(int i=0;i<nums.length;i++){
                if(nums[i]%2==0) {
                    answer[i]=odd;
                    even--;
                }else{
                    answer[i]=even;
                    odd--;
                } 
                }
        return answer;

    }
}