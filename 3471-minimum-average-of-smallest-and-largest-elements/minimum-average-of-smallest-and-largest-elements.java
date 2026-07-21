class Solution {
    public double minimumAverage(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int n:nums){
            arr.add(n);
        }
        List<Double> avg=new ArrayList<>();
        int i=0;
        while(arr.size()!=0){
            int largest=Collections.max(arr);
            int smallest=Collections.min(arr);
            avg.add((double)(largest+smallest)/2);
            i++;
            arr.remove(Integer.valueOf(largest));
            arr.remove(Integer.valueOf(smallest));
        }
        return Collections.min(avg);
    }
}