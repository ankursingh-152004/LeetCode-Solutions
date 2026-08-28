class Solution {
    public String removeDuplicates(String s) {
        char[] str=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        stack.push(str[0]);
        for(int i=1;i<str.length;i++){
            if(stack.isEmpty()){
                stack.push(str[i]);
                continue;
            }
            if(stack.peek()!=str[i]){
                stack.push(str[i]);
            }else{
                stack.pop();
            }
        }
        String ans="";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return new StringBuilder(ans).reverse().toString();
    }
}