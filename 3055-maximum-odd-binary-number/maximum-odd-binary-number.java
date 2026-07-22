class Solution {
    public String maximumOddBinaryNumber(String s) {
        int zero=0;
        int one=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='0'){
                zero++;
            }else{
                one++;
            }
        }
        one--;
        StringBuilder sb=new StringBuilder();
        while(one>0){
            sb.append('1');
            one--;
        }
        while(zero>0){
            sb.append('0');
            zero--;
        }
        sb.append('1');
        return sb.toString();
    }
}