class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            Stack<Integer> st=new Stack<>();
            while(n>0){
                st.push(n%10);
                n/=10;
            }
            while(!st.isEmpty()){
                arr.add(st.pop());
            }
        }
        int[] newArr=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            newArr[i]=arr.get(i);
        }
        return newArr;
    }
}