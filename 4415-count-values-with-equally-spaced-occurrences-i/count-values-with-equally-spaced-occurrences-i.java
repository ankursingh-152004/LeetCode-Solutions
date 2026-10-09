class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,List<Integer>> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int c=0;
        for(int a:map.keySet()){
            if(map.get(a).size()==3){
                List<Integer> l=map.get(a);
                if(l.get(1)-l.get(0)==l.get(2)-l.get(1)) c++;
            }
        }
        return c;
    }
}