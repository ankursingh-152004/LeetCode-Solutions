class Solution {
    public int findTheWinner(int n, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        int curr=0;
        while(arr.size()>1){
            int next=(curr+k-1)%arr.size();
            arr.remove(next);
            curr=next;
        }
        return arr.get(0);
            }
}