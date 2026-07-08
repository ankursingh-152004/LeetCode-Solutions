class Solution {
    public void sortColors(int[] nums) {
       HashMap<Integer,Integer> freq=new HashMap<>();
    for(int num:nums){
        freq.put(num,freq.getOrDefault(num,0)+1);
    }
    int i=0;
    int zero=freq.getOrDefault(0,0);
    while(zero>0){
        nums[i]=0;
        zero--;
        i++;
    }    
    int one=freq.getOrDefault(1,0);
    while(one>0){
        nums[i]=1;
        one--;
        i++;
    }    
    int two=freq.getOrDefault(2,0);
    while(two>0){
        nums[i]=2;
        two--;
        i++;
    }    

}
}