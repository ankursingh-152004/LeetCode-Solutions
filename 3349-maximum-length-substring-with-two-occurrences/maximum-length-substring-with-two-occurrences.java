class Solution {
    public int maximumLengthSubstring(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int[] count = new int[26];
            for (int j = i; j < s.length(); j++) {
                int ch = s.charAt(j) - 'a';
                count[ch]++;
                if (count[ch] > 2) {
                    break;
                }
                res = Math.max(res, j - i + 1);
            }
        }
            return res;

    }
}