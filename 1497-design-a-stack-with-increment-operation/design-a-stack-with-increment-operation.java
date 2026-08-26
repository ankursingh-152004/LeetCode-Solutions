class CustomStack {
    int[] arr;
    int top;
    int capacity;
    public CustomStack(int maxSize) {
       capacity=maxSize;
        arr=new int[capacity];
         top=-1;
    }
    
    public void push(int x) {
        if(top>=capacity-1) return;
        else{
            arr[++top]=x;
        }
    }
    
    public int pop() {
        if(top<0) return -1;
        else{
            int x=arr[top--];
            return x;
        }
    }
    
    public void increment(int k, int val) {
       int limit = Math.min(k, top + 1);

        for (int i = 0; i < limit; i++) {
            arr[i] += val;
    }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */