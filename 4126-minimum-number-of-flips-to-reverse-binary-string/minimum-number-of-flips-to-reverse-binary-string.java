class Solution {
    public int minimumFlips(int n) {
        int count=0;
        String s="";
        while(n!=0){
            int d=n%2;
            s+=d;
            n/=2;
        }
        int a=0;
        int b=s.length()-1;
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                count=count+2;
               
            }
             a++;
                b--;
        }
        return count;

    }
}