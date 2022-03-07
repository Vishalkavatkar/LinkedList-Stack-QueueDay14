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
		 * We have used the insertBetween method to add node in between
		 * Insert 40 to 30
		 * Final Sequence: 56->30->40->70
		 * deleting node 40
		 * Final Sequence: 56->30->70
		 */
		list.add(56);
		list.add(30);
		list.add(40);
		list.add(70);
		list.printList();
	
		list.deleteNode(40);
		list.deleteNode(80);
		list.printList();
		list.size();
	}
		
}

