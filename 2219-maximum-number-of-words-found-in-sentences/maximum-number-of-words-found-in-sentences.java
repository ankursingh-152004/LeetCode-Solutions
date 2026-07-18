class Solution {
    public int mostWordsFound(String[] sentences) {
       int c=0;
        for(int i=0;i<sentences.length;i++){
            String str=sentences[i];
            int count=0;
            char[] s=str.toCharArray();
            for(int j=0;j<s.length;j++){
                if(s[j]==' ') count++;
            }
            c=Math.max(c,count+1);
        }
        return c;
    }
}