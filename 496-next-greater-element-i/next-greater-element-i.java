class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=nextGreater(nums2);
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    ans[i]=res[j];
                }
            }
        }
        return ans;
    }
    public static int[] nextGreater(int[] arr){
        int size=arr.length;
        int[] ans=new int[size];
        for(int i=0;i<size;i++){
            boolean flag=false;
            for(int j=i+1;j<size;j++){
                if(arr[i]<arr[j]){
                    ans[i]=arr[j];
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                ans[i]=-1;
            }
        }
        return ans;
    }
}