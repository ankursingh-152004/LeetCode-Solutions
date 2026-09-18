class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int n=apple.length;
        int m=capacity.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=apple[i];
        }
        int count=0;
        for(int j=m-1;j>=0;j--){
            sum -= capacity[j];
            count++;

            if (sum <= 0) {
                break;
            }
        }
        return count;
    }
}