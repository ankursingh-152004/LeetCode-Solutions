class Solution {
    public int maxProduct(int n) {
        int firstLargest=Integer.MIN_VALUE;
        int SecondLargest=Integer.MIN_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        while(n!=0){
            int d=n%10;
            arr.add(d);
            n/=10;
        }
        Collections.sort(arr);
        return arr.get(arr.size()-1)*arr.get(arr.size()-2);
    }
}