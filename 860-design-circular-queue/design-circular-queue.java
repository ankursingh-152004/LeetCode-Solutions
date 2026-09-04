class MyCircularQueue {
    int front,rear,capacity;
    int[] arr;
    public MyCircularQueue(int k) {
        capacity=k;
        front=-1;
        rear=-1;
        arr=new int[capacity];
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()){
            return false ;
        }
        int x=arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
        front=(front+1)%capacity;
           }
              return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1 ;
        }else{
        return arr[front];
    }
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1 ;
        }else{
        return arr[rear];
    }
    }
    
    public boolean isEmpty() {
        return front==-1 && rear==-1;
    }
    
    public boolean isFull() {
        return (front==rear+1)||(front==0 && rear==capacity-1);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */