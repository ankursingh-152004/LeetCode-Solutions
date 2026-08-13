class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
     HashMap<Integer,Integer> map=new HashMap<>();
     ArrayList<Integer> ans=new ArrayList<>();
    int[] res=new int[arr1.length];
     for(int n:arr1){
        map.put(n,map.getOrDefault(n,0)+1);
     }   
     for(int i=0;i<arr2.length;i++){
        int a=map.get(arr2[i]);
        for(int j=0;j<a;j++){
            ans.add(arr2[i]);
        }
            map.remove(arr2[i]);

     }
      ArrayList<Integer> remaining = new ArrayList<>(map.keySet());

        Collections.sort(remaining);

     for(int n1:remaining){
         int count = map.get(n1);

            for (int j = 0; j < count; j++) {
                ans.add(n1);
            }
     }
     for(int i=0;i<ans.size();i++){
        res[i]=ans.get(i);
     }
     return res;
    }
}