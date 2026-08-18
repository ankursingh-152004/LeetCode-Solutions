class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            if(diff<minDiff){
                minDiff=diff;
                ans.clear();
                    List<Integer> list=new ArrayList<>();
                        list.add(arr[i-1]);
                        list.add(arr[i]);
                    ans.add(list);
                }
            else if(diff==minDiff){
                    List<Integer> list=new ArrayList<>();
                    list.add(arr[i-1]);
                    list.add(arr[i]);
                    ans.add(list);
                }
        }
        
        
    return ans;
    }
}