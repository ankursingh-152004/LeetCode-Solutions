class StockSpanner {
    Stack<Integer> s;
    ArrayList<Integer> prices;
    int i;
    public StockSpanner() {
       s=new Stack<>();
        prices = new ArrayList<>();
        i = 0;
    }
    
    public int next(int price) {
        while(s.isEmpty()==false && price>=prices.get(s.peek())){
            s.pop();
        }
        int ans=s.isEmpty()?i+1:i-s.peek();
        prices.add(price);
        s.push(i);
        i++;
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */