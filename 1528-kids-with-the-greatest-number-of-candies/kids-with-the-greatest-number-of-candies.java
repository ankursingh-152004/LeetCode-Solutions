class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> l=new ArrayList<>();
        
        int greatest=max(candies);
        for(int i=0;i<candies.length;i++){
            
                l.add(((candies[i]+extraCandies)>=greatest));
        }
        return l;
    }
    public static int max(int[] arr){
        int[] temp=arr.clone();
        Arrays.sort(temp);
        return temp[temp.length-1];
    }
}