class Solution {
    public int finalPositionOfSnake(int n, List<String> command) {
     int[][] nums=new int[n][n];
     for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            nums[i][j]=(i*n)+j;
        }
     }   
     int ans=0; int move=0;int i=0; int j=0;
     while(move<command.size()){
        if(command.get(move).equals("RIGHT")){
            ans=nums[i][j+1];
            move++;
            j=j+1;
        }else if(command.get(move).equals("LEFT")){
            ans=nums[i][j-1];
            move++;
            j=j-1;
        }else if(command.get(move).equals("DOWN")){
                ans=nums[i+1][j];
                move++;
                i=i+1;
        }else{
            ans=nums[i-1][j];
            move++;
            i=i-1;
        }
     }
     return ans;
    }
}