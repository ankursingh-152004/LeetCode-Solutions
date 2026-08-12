class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        HashSet<Integer> arr=new HashSet<>();
        for(int i:nums){
            arr.add(i);
        }
        ArrayList<Integer> arr1=new ArrayList<>(arr);
        Collections.sort(arr1,Collections.reverseOrder());
     int[] result = new int[Math.min(k, arr1.size())];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr1.get(i);
        }
        return result;
    }
}