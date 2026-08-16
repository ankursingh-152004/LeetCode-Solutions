class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int ans=original;
            while(set.contains(ans)){
                ans=ans*2;
            }
        
        return ans;
    }
}