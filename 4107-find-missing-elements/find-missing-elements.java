class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
      Arrays.sort(nums);
      int min=nums[0];
      int max=nums[nums.length-1];
      int j=0;
      for(int i=min;i<=max;i++){
        if(j<nums.length && nums[j]==i){
            j++;
            }else{
            arr.add(i);
        }
      }
      return arr;
    }
}