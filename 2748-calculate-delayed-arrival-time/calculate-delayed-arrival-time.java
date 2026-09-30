class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
       //Method 1
       int time=(arrivalTime+delayedTime)%24;
       return time;
        // int time=arrivalTime+delayedTime;
        // return time>=24?time-24:time;
    }
}