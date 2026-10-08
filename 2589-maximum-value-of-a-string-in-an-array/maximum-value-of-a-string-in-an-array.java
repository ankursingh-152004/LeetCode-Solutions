class Solution {
    public int maximumValue(String[] strs) {
        int max=Integer.MIN_VALUE;
        for(String s:strs){
            if(isInteger(s)){
                max=Math.max(max,Integer.parseInt(s));
            }else{
                max=Math.max(max,s.length());
            }
        }
    return max;
    }
    public static boolean isInteger(String s){
        for(char c:s.toCharArray()){
            if(!Character.isDigit(c)){
                return false;
            }
        }
        return true;
    }
}