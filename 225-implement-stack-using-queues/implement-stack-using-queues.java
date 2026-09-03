class MyStack {
     Queue<Integer> input;
     Queue<Integer> output;

    public MyStack() {
        input=new LinkedList<Integer>();
        output=new LinkedList<Integer>();
    }
    
    public void push(int x) {
        output.add(x);
          while (!input.isEmpty()) {
            output.add(input.remove());
        }

        
        Queue<Integer> temp = input;
        input = output;
        output = temp;
        
    }
    
    public int pop() {
        return input.remove();
    }
    
    public int top() {
        return input.peek();
    }
    
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */