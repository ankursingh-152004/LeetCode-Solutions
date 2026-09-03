class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallestOdd=Integer.MAX_VALUE;
        for(int n:nums1){
            if(n%2!=0){
                smallestOdd=Math.min(n,smallestOdd);
            }
        }
        if(smallestOdd==Integer.MAX_VALUE) return true;
        for(int n:nums1){
            if(n%2==0){
                if(n<=smallestOdd) return false;
            }
        }
        return true;
    }
}