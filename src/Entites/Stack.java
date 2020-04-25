package Entites;

public class Stack {
	 private int[] stack;
	    private int top;
	    
	    public Stack(int size){  
	        stack = new int[size];
	        top = -1;
	    }
	    
	    public boolean push(int n) {
	    	if (isFull()) {
	    		 System.out.println("\nStack Overflow");
	             return false;
	        } 
	        else {
	    		top++;
	            
	            stack[top] = n;
	            
	            System.out.println(n + " pushed into stack");
	    		return true;
	    	}
	    }
	    
	    public int pop() {
	        if (isEmpty()) { 
	            System.out.println("Stack Underflow"); 
	            
	            return 0; 
	        }

	        return stack[top--];
	    }

	    public int peek() { 
	        if (top < 0) { 
	            System.out.println("Stack Underflow"); 
	            
	            return 0; 
	        } 
	        else { 
	            int x = stack[top]; 

	            System.out.println("The element at the top of the stack is " + x + "\n");
	            
	            return x; 
	        } 
	    } 
	    
	    public void printStack(){ 
	        if(isEmpty())
	            System.out.println("Stack Underflow"); 

	        for (int i = 0; i <= top; i++) {
				 System.out.print(stack[i] + " ");
			 }
	    }
	    
	    public boolean isFull() {
	        if (top == stack.length - 1) 
	            return true;
	        
	        return false;
	    }

	    public boolean isEmpty() {
	        if (top == -1) 
	            return true;

	        return false;
	    }
}
