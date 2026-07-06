class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder();
    int n=pattern.length();
    Stack<Character> st=new Stack<>();
        for(int i=0;i<=n;i++){
          st.push((char)('1'+i));
          if(i==n || pattern.charAt(i)=='I'){
            while(!st.isEmpty()){
               sb.append(st.pop());
            }
          }
        }
        return sb.toString(); 

    }
}