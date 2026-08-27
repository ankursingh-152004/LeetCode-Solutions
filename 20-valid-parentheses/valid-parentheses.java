class Solution {
    public boolean isValid(String s) {
        char[] arr=s.toCharArray();
        Deque<Character> stack=new ArrayDeque<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='(' || arr[i]=='[' ||arr[i]=='{'){
                stack.push(arr[i]);
            }else{
                if(stack.isEmpty()){
                    return false;
                }else if(isPair(stack.peek(),arr[i])){
                    stack.pop();
                    continue;
                }
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean isPair(char val1,char val2){
        return ((val1=='(' && val2==')')||(val1=='{' && val2=='}')||(val1=='[' && val2==']'));
    }
}