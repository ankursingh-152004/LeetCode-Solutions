class Solution {
    public int findMaxK(int[] nums) {
        HashSet<Integer>  set=new HashSet<>();
        HashSet<Integer>  set1=new HashSet<>();

        for(int n:nums){
            set.add(n);
        }
        for(int n:nums){
            if(set.contains(-n)) set1.add(n);
        }
        int max=Integer.MIN_VALUE;
        for(int n:set1){
            max=Math.max(max,n);
        }
        return max==Integer.MIN_VALUE?-1:max;
    }
}