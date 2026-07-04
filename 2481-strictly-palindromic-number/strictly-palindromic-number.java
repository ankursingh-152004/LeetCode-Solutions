class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++){
            String base= Integer.toString(n, i);
            if(reverse(base)==false){
                return false;
            }
        }
        return true;

    }
        boolean reverse(String n){
            char[] digits =n.toCharArray();
            int i=0; 
            int j=digits.length-1;
            while(i<=j){
                
                if(digits[i]!=digits[j]){
                return false;
            }
            
            i++;
            j--;
        }
        return true;
        }


}