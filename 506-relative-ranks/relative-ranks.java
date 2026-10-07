class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] arr=score.clone();
        Arrays.sort(arr);
        HashMap<Integer,Integer> map=new HashMap<>();
        int k=1;
        for(int i=arr.length-1;i>=0;i--){
            map.put(arr[i],k++);
        }
        String[] ans=new String[score.length];
        for(int j=0;j<score.length;j++){
            int res=map.get(score[j]);
            if(res==1){
                ans[j]="Gold Medal";
            }else if(res==2){
                ans[j]="Silver Medal";
            }else if(res==3){
                ans[j]="Bronze Medal";
            }else{
                ans[j]=Integer.toString(res);
            }
        }
    return ans;
    }
}