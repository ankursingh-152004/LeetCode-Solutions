class Solution {
    public int countSeniors(String[] details) {
       int count=0;
        for(int i=0;i<details.length;i++){
        char[] str=details[i].toCharArray();
        int digits=(str[11]-'0')*10+(str[12]-'0');
        if(digits>60){
            count++;
        }
        
        }
        return count;
    }
}