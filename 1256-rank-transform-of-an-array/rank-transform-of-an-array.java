class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res=new int[arr.length];
        int[] ans=Arrays.copyOf(arr,arr.length);
        Arrays.sort(ans);
        int rank=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:ans){
            if(!map.containsKey(ele)){
                map.put(ele,rank++);
            }
        }

        for(int i=0;i<arr.length;i++){
            res[i]=map.get(arr[i]);
        }
        return res;
    }
}