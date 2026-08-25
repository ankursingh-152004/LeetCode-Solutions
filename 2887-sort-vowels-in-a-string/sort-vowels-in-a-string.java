class Solution {
    public String sortVowels(String s) {
       ArrayList<Character> vowel=new ArrayList<>();
       char[] c=s.toCharArray();
       for(char ch:c){
        if(isVowel(ch)){
            vowel.add(ch);
        }
       } 
    Collections.sort(vowel);
    int k=0;
    for(int i=0;i<c.length;i++){
        if(isVowel(c[i])){
            c[i]=vowel.get(k);
            k++;
        }
    }
    return new String(c);
    }
    private static boolean isVowel(char c){
        return c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
}