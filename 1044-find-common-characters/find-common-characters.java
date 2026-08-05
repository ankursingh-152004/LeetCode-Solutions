class Solution {
    public List<String> commonChars(String[] words) {
        ArrayList<String> ans=new ArrayList<>();
        int[] minFreq=new int[26];
        Arrays.fill(minFreq,Integer.MAX_VALUE);
        for(String word:words){
            int[] c=new int[26];
            for(char i:word.toCharArray()){
                c[i-'a']++;
            }
            for(int j=0;j<26;j++){
                minFreq[j]=Math.min(minFreq[j],c[j]);
            }
        }
        for(int i=0;i<26;i++){
            while(minFreq[i]>0){
                ans.add(String.valueOf((char) (i + 'a')));
                minFreq[i]--;
            }
        }
        return ans;
    }
}