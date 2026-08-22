class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n=grid.length;
        int[][] ans=new int[n-2][n-2];
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[0].length;j++){
                ans[i][j]=maxValue(grid,i,j);
            }
        }
        return ans;
    }
    private static int maxValue(int[][] grid,int a,int b){
        int max=Integer.MIN_VALUE;
        for(int i=a;i<a+3;i++){
            for(int j=b;j<b+3;j++){
                max=Math.max(max,grid[i][j]);
            }
        }
        return max;
    }
}