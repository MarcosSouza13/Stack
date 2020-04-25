package Application;

import java.util.Scanner;

import Entites.Stack;

public class Program {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Inform the stack size: ");        
        int size = scanner.nextInt();
        
        Stack stack = new Stack(size);
        
        while(true) {
            System.out.println("\nOptions");
            System.out.println("0 - Exit");
            System.out.println("1 - Push an element on the stack");
			System.out.println("2 - Remove an element on the stack");
			System.out.println("3 - Check the element at the of the stack");
            System.out.println("4 - Print the stack");

            System.out.println("\nInform a number: ");
            int ch = scanner.nextInt();
			
			switch(ch) {
				case 0:
					System.out.println("End");
					System.exit(0);
					break;

				case 1:
					System.out.println("\nInform the value: ");
					int n = scanner.nextInt();
					
					stack.push(n);
					break;

				case 2:
					if(!stack.isEmpty()) {
						stack.pop();
						
						System.out.println("\nNumber successfully removed");
					}
					else 
						System.out.println("\nError, stack is empty");		

					break;

				case 3:
					stack.peek();
					break;
				
				case 4:
					stack.printStack();
					break;
				
				default:
					break;
			}
		}
	}
}
