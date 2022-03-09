package stackAndQueue;

public class Stack {
	
	public static void main(String[] args) {
		StackService stack = new StackService();
		System.out.println("Elements in the stack are : ");
		stack.push(70);
		stack.push(30);
		stack.push(56);
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
			
		}
		
	}

}
