class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        HashSet<Integer> set3=new HashSet<>();
        HashSet<Integer> set=new HashSet<>();


        for(int n:nums1){
            set1.add(n);
            set.add(n);
        }
         for(int n:nums2){
            set2.add(n);
            set.add(n);
        }
         for(int n:nums3){
            set3.add(n);
            set.add(n);
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int i:set){
            if(set1.contains(i) && set2.contains(i)||set2.contains(i) && set3.contains(i)||set3.contains(i) && set1.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}