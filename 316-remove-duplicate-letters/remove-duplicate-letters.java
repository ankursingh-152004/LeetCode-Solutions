class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        int[] last=new int[26];
        for(int i=0;i<n;i++){
            last[s.charAt(i)-'a']=i;
        }
        boolean[] visited=new boolean[26];
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(visited[c-'a']){
                continue;
            }
            while(!stack.isEmpty() && stack.peek()>c && last[stack.peek()-'a']>i){
                visited[stack.pop()-'a']=false;
            }
            stack.push(c);
            visited[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for( char ch:stack){
            sb.append(ch);
        }
        return sb.toString();
    }
}