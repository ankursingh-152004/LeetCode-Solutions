class Solution {
    public long sumAndMultiply(int n) {
        String str="";
        str+=n;
        String newStr="";
        for(int i=0;i<str.length();i++){
            if(!(str.charAt(i)=='0')){
                newStr+=str.charAt(i);
            }
        }
        if(newStr=="") return 0;
        long ans=Integer.parseInt(newStr);
        return ans*sum(ans);
    }
    public static long sum(long n){
        long sum=0;
        while(n!=0){
            long d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}