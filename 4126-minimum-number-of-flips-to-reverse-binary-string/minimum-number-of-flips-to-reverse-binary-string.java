// class Solution {
//     public int minimumFlips(int n) {
//         int count=0;
//         String s="";
//         while(n!=0){
//             int d=n%2;
//             s+=d;
//             n/=2;
//         }
//         int a=0;
//         int b=s.length()-1;
//         while(a<b){
//             if(s.charAt(a)!=s.charAt(b)){
//                 count=count+2;
               
//             }
//              a++;
//                 b--;
//         }
//         return count;

//     }
// }
class Solution {
    public int minimumFlips(int n) {
        String res=Integer.toBinaryString(n);
        String rev=new StringBuilder(res).reverse().toString();
        int count=0;
        for(int i=0;i<res.length();i++){
            if(res.charAt(i)!=rev.charAt(i)){
                count++;
            }
        }
        return count;
    }
}