class Solution {
    public int maxProduct(int n) {
        //first method
        // int firstLargest=Integer.MIN_VALUE;
        // int SecondLargest=Integer.MIN_VALUE;
        // ArrayList<Integer> arr=new ArrayList<>();
        // while(n!=0){
        //     int d=n%10;
        //     arr.add(d);
        //     n/=10;
        // }
        // Collections.sort(arr);
        // return arr.get(arr.size()-1)*arr.get(arr.size()-2);
        

        //second method
        int m1=Integer.MIN_VALUE;
        int m2=Integer.MIN_VALUE;
        while(n!=0){
            int d=n%10;
            if(d>=m1){
                m2=m1;
                m1=d;
            }else if(d>m2){
                m2=d;
            }
        n/=10;

        }
    return m1*m2;

    }
}