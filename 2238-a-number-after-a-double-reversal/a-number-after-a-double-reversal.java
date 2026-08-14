class Solution {
    public boolean isSameAfterReversals(int num) {
    int reverse1=rev( num);
    int reverse2=rev( reverse1);
    return (reverse2==num)?true:false;
    }
       public static int rev(int num){
        int rev=0;
        while(num!=0){
            int d=num%10;
           rev=rev*10+d;     
            num/=10;
        }
        return rev;
       }
}