class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
       int l=0;
       int g=0;
       int eq=0;
       for(int n:nums){
        if(n<pivot) l++;
        else if(n>pivot) g++;
        else eq++;
       }
       int i=0;
       int j=l;
       int k=l+eq;
       int[] ans=new int[nums.length];
       for(int n:nums){
        if(n<pivot){
            ans[i]=n;
            i++;
        }else if(n>pivot)
        {
            ans[k]=n;
            k++;
        }else{
            ans[j]=n;
            j++;
        }

       }


return ans;

    }
}