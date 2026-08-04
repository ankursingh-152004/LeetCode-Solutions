class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        ArrayList<Integer> l=new ArrayList<>(map.keySet());

        Collections.sort(l,(a,b)->{
            if(map.get(a)!=map.get(b)){
                return map.get(a)-map.get(b);
            }
            return b-a;
        });
        int res[]=new int[nums.length];
        int id=0;
        for(int n:l){
            int f=map.get(n);
            for(int i=0;i<f;i++){
                res[id++]=n;
            }
        }
        return res;
    }
}