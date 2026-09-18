class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int c=0;
        int n=batteryPercentages.length;
        for(int i=0;i<n;i++){
            if(batteryPercentages[i]>0){
                c++;
                for(int j=i+1;j<n;j++){
                    batteryPercentages[j]--;
                }
            }else{
                continue;
            }
        }
        return c;
    }
}