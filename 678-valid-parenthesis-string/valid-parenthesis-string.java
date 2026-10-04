class Solution {
    public boolean checkValidString(String s) {
      int l=0;
      int r=0;
     
      for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('){
             l++;
             r++;
        }
        else if(s.charAt(i)==')'){
             r--;
             l--;
        }
        else {
            l++;
            r--;
      }  
      if(l<0){
        return false;
      }
      if(r<0){
        r=0;
      }
     
    }
     return r==0;
    }
}