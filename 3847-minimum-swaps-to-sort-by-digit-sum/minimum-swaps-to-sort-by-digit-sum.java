class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=sumOfDigits(nums[i]);
        }
        Arrays.sort(arr,(a,b)->{
            if(a[1]!=b[1]){
                return a[1]-b[1];
            }
          return  a[0]-b[0];
        });
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],i);
        }
        int swap=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=arr[i][0]){
                swap++;
                int currIndex=map.get(arr[i][0]);
                map.put(nums[i],currIndex);
                map.put(arr[i][0],i);

                int temp=nums[i];
                nums[i]=nums[currIndex];
                nums[currIndex]=temp;
            }
        }
          return  swap;
    }
    private static int sumOfDigits(int n){
        int sum=0;
        while(n!=0){
            int d=n%10;
            sum+=d;
            n/=10;
        }
        return sum;
    }
}