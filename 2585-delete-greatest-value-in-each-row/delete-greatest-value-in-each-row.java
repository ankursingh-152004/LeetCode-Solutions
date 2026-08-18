class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int sum=0;
        List<List<Integer>> nums=new ArrayList<>();
        for(int a[]:grid){
            List<Integer> num=new ArrayList<>();
            for(int b:a){
                num.add(b);
            }
            nums.add(num);
        }
        while(nums.get(0).size()>0){
            int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            int rowMax=Integer.MIN_VALUE;
            int index=-1;
            for(int j=0;j<nums.get(i).size();j++){
                if(nums.get(i).get(j)>rowMax){
                    rowMax=nums.get(i).get(j);
                    index=j;
                }
            }
            nums.get(i).remove(index);
            max=Math.max(max,rowMax);
        }
            sum+=max;

        }
        return sum;
    }
}