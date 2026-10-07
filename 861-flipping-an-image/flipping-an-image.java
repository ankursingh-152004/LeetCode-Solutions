class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int rowLength=image[0].length;
        for(int[] row:image){
            for(int i=0;i<(rowLength+1)/2;i++){
                int temp=row[i]^1;
                row[i]=row[rowLength-1-i]^1;
                row[rowLength-1-i]=temp;
            }
        }
        return image;
    }
}