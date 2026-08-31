class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        char[] c=s.toCharArray();
        st.push(c[0]);
        for(int i=1;i<c.length;i++){
            int ch=c[i];
            if (!st.isEmpty() &&
                ((st.peek() == 'A' && ch == 'B') ||
                 (st.peek() == 'C' && ch == 'D'))){
                st.pop();
            }else{
            st.push(c[i]);
        }
        }
        
        return st.size();
    }
}