class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] arr=new List[nums.length+1];
        List<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(arr[freq]==null){
                arr[freq]=new ArrayList<>();
            }
            arr[freq].add(key);
        }
        for(int i=arr.length-1;i>=0 && res.size()<k;i--){
            if(arr[i]!=null){
                res.addAll(arr[i]);
            }
        }
    return res.stream().mapToInt(Integer::intValue).toArray();
    }
}