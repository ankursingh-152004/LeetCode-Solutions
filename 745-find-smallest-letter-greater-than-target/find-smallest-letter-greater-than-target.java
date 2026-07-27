class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int ch=target-'a';
        for(int i=0;i<letters.length;i++){
            if((letters[i]-'a')>ch) return letters[i];
        }
        return letters[0];
    }
}