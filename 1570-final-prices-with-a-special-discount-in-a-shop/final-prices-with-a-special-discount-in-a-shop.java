class Solution {
    public int[] finalPrices(int[] prices) {
        int[] res=new int[prices.length];
        int j;
        for(int i=0;i<prices.length;i++){
            res[i]=prices[i];
            j=i+1;
            while(j<prices.length){
            if(prices[j]<=prices[i]){
                res[i]=prices[i]-prices[j];
                break;
            }
           j++;
            }
        }
        return res;
    }
}