class MinStack {

    Stack<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack();
        minStack = new Stack();
    }
    
    public void push(int val) {
        
        stack.push(val);

        if ( minStack.isEmpty() ) {
            minStack.push( val );
        } else if ( val <= minStack.peek() ) {
            minStack.push( val );
        }
        System.out.println("Push"+ minStack +" "+stack );
    }
    
    public void pop() {
        
        System.out.println("pop"+ minStack +" "+stack+" "+" "+stack.peek() +" "+  minStack.peek()+" "+(stack.peek() ==  minStack.peek()) );
        if ( stack.peek().equals(  minStack.peek()) ) {
            minStack.pop();
        }
        stack.pop();
        // System.out.println("pop"+ minStack +" "+stack+" "+stack.peek() +" "+  minStack.peek() );
        
    }
    
    public int top() {
        System.out.println("Top"+ minStack +" "+stack );
        return stack.peek();
    }
    
    public int getMin() {
        System.out.println("GetMin"+ minStack +" "+stack );
        return minStack.peek();
    }
}
