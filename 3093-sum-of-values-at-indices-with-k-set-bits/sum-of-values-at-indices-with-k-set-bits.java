class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       int sum=0;
        for(int i=0;i<nums.size();i++){
            if(countBinary(i)==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
    public static int countBinary(int n){
        int c=0;
        while(n!=0){
            int d=n%2;
            if(d==1) c++;
            n/=2;
        }
        return c;
    }
}