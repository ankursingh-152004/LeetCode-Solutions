class Solution {
    public int[] numberOfPairs(int[] nums) {
        int countPair=0;
        int countLeft=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:map.keySet()){
            if(map.get(n)%2==0){
                countPair+=map.get(n)/2;
            }else{
                countPair+=map.get(n)/2;
                countLeft+=map.get(n)%2;
            }
        }
        int[] ans=new int[2];
        ans[0]=countPair;
        ans[1]=countLeft;
        return ans;
    }
}