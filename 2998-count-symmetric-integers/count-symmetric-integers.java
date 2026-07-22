class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int c=0;
        for(int i=low;i<=high;i++){
            String str=Integer.toString(i);
            int l=str.length();
            if(l%2!=0) continue;
            int lSum=0;
            int rSum=0;
            for(int j=0;j<l/2;j++){
                lSum+=str.charAt(j)-'0';
            }
            
            for(int k=l/2;k<l;k++){
                rSum+=str.charAt(k)-'0';
            }
            if(lSum==rSum) c++;
        }
        return c;
    }
}