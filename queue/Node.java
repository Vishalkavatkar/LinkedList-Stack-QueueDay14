package queue;

public class Node {
	/**
	 * Created a class Node to store the data and the next
	 */
		int data;
		Node next;
		
		/**
		 * Constructor
		 * We have taken next as null because when the new node is created we are taking the next node as null
		 * @param data : data will be passed
		 */
		public Node(int data) {
			super();
			this.data = data;
			next = null;
		}
		

}
