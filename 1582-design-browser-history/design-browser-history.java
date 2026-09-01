class BrowserHistory {
    Stack<String> front;
    Stack<String> back=new Stack<>();

    public BrowserHistory(String homepage) {
        back.push(homepage);
        front=new Stack<String>();
    }
    
    public void visit(String url) {
        back.push(url);
        front=new Stack<String>();
    }
    
    public String back(int steps) {
        while(steps>0 && back.size()>1){
            front.push(back.peek());
            back.pop();
            steps--;
        }
        return back.peek();
    }
    
    public String forward(int steps) {
        while(steps>0 && front.size()>0){
            back.push(front.peek());
            front.pop();
            steps--;
        }
        return back.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */