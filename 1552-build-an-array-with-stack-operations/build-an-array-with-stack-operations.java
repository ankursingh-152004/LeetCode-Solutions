class Solution {
    public List<String> buildArray(int[] target, int n) {
        Stack<String> st=new Stack<>();
        int curr=1;
        for(int num:target){
            while(curr<num){
                st.push("Push");
                st.push("Pop");
                curr++;
            }
            st.push("Push");
            curr++;
        }
        return st;
    }
}