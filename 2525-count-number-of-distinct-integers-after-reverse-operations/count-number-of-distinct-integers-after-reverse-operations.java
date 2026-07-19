class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> arr=new HashSet<>();
        for(int n:nums){
            arr.add(n);
        }
        for(int n1:nums){
            arr.add(rev(n1));
        }
        return arr.size();
    }
    public static int rev(int n){
        int r=0;
        while(n!=0){
            int d=n%10;
            r=r*10+d;
            n/=10;
        }
        return r;
    }
}