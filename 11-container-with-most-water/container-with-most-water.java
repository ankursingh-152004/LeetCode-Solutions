class Solution {
    public int maxArea(int[] height) {
        int maxHeight=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            int l=Math.min(height[i],height[j]);
            int b=j-i;
            maxHeight=Math.max(maxHeight,l*b);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        
        return maxHeight;
    }
}