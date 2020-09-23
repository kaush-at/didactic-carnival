package easy;

import java.util.Stack;

public class MinStack {

	    Stack<Integer> regular;
	    Stack<Integer> minStack;
	    /** initialize your data structure here. */
	    public MinStack() {
	        this.regular = new Stack<>();
	        this.minStack = new Stack<>();
	    }
	    
	    public void push(int x) {
	        regular.push(x);
	        if(minStack.empty() || minStack.peek() >= x){
	            minStack.push(x);
	        }
	    }
	    
	    public void pop() {
	        int removedFromRegular = regular.pop();
	        if(minStack.peek() == removedFromRegular){
	            minStack.pop();
	        }
	    }
	    
	    public int top() {
	        return regular.peek();
	    }
	    
	    public int getMin() {
	        return minStack.peek();
	    }
	}

	/**
	 * Your MinStack object will be instantiated and called as such:
	 * MinStack obj = new MinStack();
	 * obj.push(x);
	 * obj.pop();
	 * int param_3 = obj.top();
	 * int param_4 = obj.getMin();
	 */


