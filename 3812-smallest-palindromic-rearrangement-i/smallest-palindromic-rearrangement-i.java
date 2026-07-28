
class Solution {
    public String smallestPalindrome(String s) {

        if (s.length() <= 1)
            return s;

        int n = s.length();

        char[] left = new char[n / 2];

        // Copy first half
        for (int i = 0; i < n / 2; i++) {
            left[i] = s.charAt(i);
        }

        // Sort first half
        Arrays.sort(left);

        StringBuilder ans = new StringBuilder();

        // Left part
        for (int i = 0; i < left.length; i++) {
            ans.append(left[i]);
        }

        // Middle character (only for odd length)
        if (n % 2 == 1) {
            ans.append(s.charAt(n / 2));
        }

        // Right part
        for (int i = left.length - 1; i >= 0; i--) {
            ans.append(left[i]);
        }

        return ans.toString();
    }
}



// class Solution {
//     public String smallestPalindrome(String s) {
//         if(s.length()<=1) return s;
//         StringBuilder st=new StringBuilder();
//         char[] =s.toCharArray();
//         for(int i=0;i<=s.length()/2;i++){
//             n[i]=s.charAt(i);
//         }
//         Arrays.sort(n);
//         for(int i=0;i<n.length;i++){
//             st.append(n[i]);
//         }
//         for(int i=n.length-2;i>=0;i--){
//             st.append(n[i]);
//         }

//         return st.toString();
        

//     }
// }


