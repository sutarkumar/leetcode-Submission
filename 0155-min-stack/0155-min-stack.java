class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;

    public MinStack() {
        st = new Stack();
        minStack = new Stack();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || minStack.peek() > val){
            minStack.push(val);
        }else{
            minStack.push(minStack.peek());
        }
    }
    
    public void pop() {
        minStack.pop();
        st.pop();
    }
    
    public int top() {
        int x = st.peek();
        return x;
    }
    
    public int getMin() {
        return minStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */