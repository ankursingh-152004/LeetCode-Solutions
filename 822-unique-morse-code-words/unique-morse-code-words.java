class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] d={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> str=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i++){
                sb.append(d[s.charAt(i)-'a']);
            }
            str.add(sb.toString());
        }
        return str.size();
    }
}