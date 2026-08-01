class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> str=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            str.put(arr[i],str.getOrDefault(arr[i],0)+1);
            
        } 
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(str.get(arr[i])==1){
                c++;
                if(c==k) return arr[i];
            }
        }
        return "";
    }
}