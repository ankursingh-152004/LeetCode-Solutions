class Solution {
    public double trimMean(int[] arr) {
        double sum=0.0;
        int n=arr.length;
        int start=n*5/100;
        int end=n-start;
        double total_length=end-start;
        Arrays.sort(arr);
        for(int i=start;i<end;i++){
            sum+=arr[i];
        }
        return sum/total_length;
    }
}