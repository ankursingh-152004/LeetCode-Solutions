class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int sum=0;
        for(int i:map.keySet()){
            if(map.get(i)>1){
                continue;
            }else{
                sum+=i;
            }
        }
        return sum;
    }
}