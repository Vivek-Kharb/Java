class MyStack {
    Queue<Integer> qu = new LinkedList<>();

    public MyStack() {

    }

    public void push(int x) {
        qu.add(x);
    }

    public int pop() {
        int n = qu.size();
        while(n>1){
            qu.add(qu.remove());
            n--;
        }
        int k = qu.peek();
        qu.remove();
        return k ;
    }

    public int top() {
        int n = qu.size();
        while(n>1){
            qu.add(qu.remove());
            n--;
        }
        int k = qu.peek();
        qu.add(qu.remove());
        return k ;
    }

    public boolean empty() {
        return qu.isEmpty();
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