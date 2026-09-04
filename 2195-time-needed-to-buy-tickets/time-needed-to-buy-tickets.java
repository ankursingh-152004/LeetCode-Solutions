class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            queue.add(i);
        }
        while(!queue.isEmpty()){
            time++;
            int front=queue.poll();
            tickets[front]--;
            if(front==k && tickets[front]==0) return time;
            if(tickets[front]!=0){
                queue.add(front);
            }
        }
        return time;
    }
}