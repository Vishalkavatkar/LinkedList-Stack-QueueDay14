package linkedList;

public class LinkedListService {
	Node head;
	/**
	 * We have created the method add to add node.
	 * In this we have added the node to the last 
	 * First we will check if the head is null.
	 * Then we have created a node as currNode and assign it to head and then we will update the current Node.
	 * We will update the currNode till it is not null 
	 * 	When reached to last node then we will assign the currNode.next as new node
	 * @param data We are passing the data here
	 */
	
	//function
	public void add(int data) {
		Node newNode = new Node(data);
		// if head or LinkedList is empty
		if(head==null) {
			head = newNode;
			return;	
		}
		
		//if linked list present
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	/**
	 * [2]Method to add data at the first
	 * 1. First check if the head is null or LinkedList exists
	 * 2. If null then we will create the new node and assign the head to it.
	 * 3. If linkedList exists then we will point the head to newNode.next
	 * 4. And then move the head to new node.  
	 * @param data : we are passing the data here
	 */
	
	public void addFirst(int data) {
		//creating new node
		Node newNode = new Node(data);
		// if LinkedList is empty
		if(head == null) {
			head = newNode;
			return;
		}	
		//if LinkedList exists then from point 3.
		newNode.next = head;
		head = newNode;	
	}
	
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		//we are not moving the head to traverse. We are assigning the currNode to head as changing the currNode
		Node currNode = head;
		//Here we are traversing till the currNode is not null and then display the data of currNode 
		while(currNode!= null) {
			System.out.print(currNode.data + " -->");
			// then we are incrementing the currNode to next
			currNode = currNode.next;
		}
		 System.out.println("NULL");
	}
	
	
	

}
