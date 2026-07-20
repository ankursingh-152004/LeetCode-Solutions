class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String s=words[i];
            if(palindrome(s)){
                return s;
            }
        }
        return "";
    }
    public static boolean palindrome(String str){
        int j=str.length()-1;
        int i=0;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}