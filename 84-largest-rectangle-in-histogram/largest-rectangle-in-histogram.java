class Solution {
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