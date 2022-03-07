package linkedList;

public class LinkedList {
	Node head;
	
	/**
	 *  Main method for LinkedList
	 *  calling the methods in the main function
	 */
	public static void main(String[] args) {
		LinkedListService list = new LinkedListService();
		
		/**
		 * calling add method to add node
		 * add will add at last
		 */
		list.add(56);
		list.add(30);
		list.add(70);
		list.printList();
		
	}
		
}

