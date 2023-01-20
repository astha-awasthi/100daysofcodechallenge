class MyQueue {
    private ArrayList<Integer> array;

    public MyQueue() {
        array = new ArrayList<>();
    }
    
    public void push(int x) {
        array.add(x);
    }
    
    public int pop() {
        int x = this.array.get(0);
        array.remove(0);
        return x;
    }
    
    public int peek() {
        return array.get(0);
    }
    
    public boolean empty() {
        return array.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
