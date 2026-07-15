class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
     String res="";
     for(int i=0;i<words.length;i++){
        String s=words[i];
        char[] arr=s.toCharArray();
        int sum=0;
        for(int j=0;j<arr.length;j++){
            sum+=weights[arr[j]-'a'];
        }
        res+=(char)('z'-(sum%26));
     }   
     return res;
    }
}