class Solution {//if x xor a=b then by taking xor both sides
    public int[] findArray(int[] pref) {//Final isolated formula:x=b xor a
        int[] arr=new int[pref.length];
        arr[0]=pref[0];
        for(int i=1;i<pref.length;i++){
            arr[i]=pref[i]^pref[i-1];
        }
        return arr;
    }
}