class Solution {
    public boolean isAcronym(List<String> words, String s) {
        String ans="";
        for(int i=0;i<words.size();i++){
            String str=words.get(i);
            ans+=str.charAt(0);
        }
        if(!ans.equals(s)) return false;
        else return true;
    }
}