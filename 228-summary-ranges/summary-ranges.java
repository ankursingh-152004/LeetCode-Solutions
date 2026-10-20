class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> s=new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int start=nums[i];
            int j=i;
            while(j+1<nums.length && nums[j+1]==nums[j]+1){
                j++;
            }
            if(start==nums[j]){
                s.add(String.valueOf(start));
            }else{
                s.add(start+"->"+nums[j]);
            }
            i=j+1;
        }
        return s;
    }
}