class Solution {
    public List<Integer> majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Integer> ans=new ArrayList<>();
        for(int a:map.keySet()){
        if(map.get(a)>Math.floor(n/3)) ans.add(a);
    }
    return ans;
    }
}