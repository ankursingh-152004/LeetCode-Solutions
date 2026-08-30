class Solution {
    public int maximalRectangle(char[][] mat) {
        int R=mat.length;
        int C=mat[0].length;
        int[][] matrix=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                matrix[i][j]=(mat[i][j]-'0');
            }
        }
        int res = largestRectangleArea(matrix[0]);

        for (int i = 1; i < R; i++) {

            for (int j = 0; j < C; j++)

                if (matrix[i][j] ==1)
                    matrix[i][j] += matrix[i - 1][j];

            res = Math.max(res, largestRectangleArea(matrix[i]));
        }

        return res;
    
    }
    public int largestRectangleArea(int[] arr) {
        int n=arr.length;
        int top_index;
        int curr;
        Stack<Integer> s=new Stack<>();
        int res=0;
        for(int i=0;i<n;i++){
            while(s.isEmpty()==false && arr[s.peek()]>=arr[i]){
                top_index=s.peek();
                s.pop();
                curr=arr[top_index]*(s.isEmpty()?i:i-s.peek()-1);
                res=Math.max(res,curr);
            }
            s.push(i);
        }
            while(s.isEmpty()==false){
                top_index=s.peek();
                s.pop();
                curr=arr[top_index]*(s.isEmpty()?n:n-s.peek()-1);
                res=Math.max(res,curr);
            }

        
        return res;
    }
}