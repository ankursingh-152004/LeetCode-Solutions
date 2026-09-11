class Solution {
    public int totalNumbers(int[] digits) {
        int[] arr=new int[10];
        int res=0;
        for(int d:digits) arr[d]++;
        for(int i=1;i<10;i++){
            for(int j=0;j<10;j++){
                for(int k=0;k<10;k+=2){
                    arr[i]--;
                    arr[j]--;
                    arr[k]--;
                    if(arr[i]>=0 && arr[j]>=0 && arr[k]>=0) res++;
                     arr[i]++;
                    arr[j]++;
                    arr[k]++;
                }
            }
        }
        return res;
    }
}