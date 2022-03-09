package stackAndQueue;

public class StackService {
	
	//head is the head of linked list and top of stack
	public static Node head;
	
	/**
	 * created a method  isEmpty 
	 * it will check head if empty then it return true 
	 * else false
	 * @return
	 */
	public static boolean isEmpty() {
		
		return head == null;
		
	}
	
	/**
	 * created method to push data to the stack.
	 * First we have created a new node for the data
	 * If Stack is empty then we will make the new node as head
	 * If elements exists then the newNode next will point to the current head
	 * And the newNode will be new head.
	 * @param data
	 */
	public static void push(int data) {
		Node newNode = new Node(data);
		
		if(isEmpty()) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	/**
	 * Creating Method pop to delete the top element
	 * it deletes the top element as well as return it 
	 * We assign the top as the data of head
	 * We delete the top element as making the next element as head.
	 * And then we return the top
	 * @return : we are deleting and returning the top element
	 */
	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is Empty...");
		}
		int top = head.data;
		head = head.next;
		return top;
	}
	
	/**
	 * Creating Method peek to check the top element
	 * In this we return the head data as it is the top element. 
	 * @return: we return the head data
	 */
	public int peek() {
		if (isEmpty()) {
			System.out.println("Stack is Empty...");
		}
		return head.data;
	}
	
	
	

}
