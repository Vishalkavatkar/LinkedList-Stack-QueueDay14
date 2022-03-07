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
		 * Here we are calling the add method to add node
		 * We used addFirst method 
		 *  Node with data 70 is First Created
		 *  Next 30 is added to 70
		 *  Finally 56 is added to 30
		 *  LinkedList Sequence: 56->30->70
		 */
		list.addFirst(70);
		list.addFirst(30);
		list.addFirst(56);
		list.printList();
		
	}
		
}

