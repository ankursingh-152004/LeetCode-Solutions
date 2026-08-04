class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int maxFreq=0;
        for(int n:nums){
           
                maxFreq=Math.max(maxFreq,map.get(n)); 
        }
        int ans=0;
        for(int n:map.keySet()){
          if(maxFreq==map.get(n)){
                ans+=map.get(n);
            }
        }
        return ans;
    }
}