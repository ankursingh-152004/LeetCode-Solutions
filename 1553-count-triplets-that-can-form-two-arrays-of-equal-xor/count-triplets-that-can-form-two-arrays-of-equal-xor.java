class Solution {
    public int countTriplets(int[] arr) {
        int n=arr.length;
        int c=0;
        int i=0;
        while(i<n-1){
            int a=0;
            int j=i+1;
            while(j<n){
                a^=arr[j-1];
                int b=0;
               int  k=j;
                while(k<n){
                    b^=arr[k];
                    if(a==b) c++;
                     k++;
                }
                
            j++;
            }
            i++;
        }
        return c;
    }
}