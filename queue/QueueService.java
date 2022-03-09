package queue;

/**
 * we have defined the service of the Queue;
 * Procedure:
 * 1. created a method isEmpty to check if the LinkedList or Queue is empty or not.
 * 2. created the enqueu method to add the data to the Queue .
 * 3. created dequeue to delete the head element
 * 4. peek to check the head element
 */

public class QueueService {
	
	//defined 2 variables head and tail we will add from tail and remove from head (FIFO format)
	static Node head = null;
	static Node tail = null;
	
	/**
	 * creating method to check if the Queue is empty
	 * If head and tail is null then it will return true.
	 * If not null then will return false
	 * @return
	 */
	public boolean isEmpty() {
		return head == null & tail == null;
	}
	
	/**
	 * creating method to add data to the Queue.
	 * First we have created a new node for the data
	 * If Queue is empty then we will add tail and make the tail as head
	 * If elements exists then the tail next will point to newNode
	 * And the newNode will be tail now.
	 * @param data
	 */
	
	public void enqueu (int data) {
		Node newNode = new Node(data);
		if(tail == null) {
			tail = head = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	/**
	 * creating method dequeue to delete the head 
	 * First we check if it is empty
	 * Then we create variable front and assign head data to it.
	 * If there is only 1 element then head == tail so we will make the tail null
	 * Or we will make the head as head.next and then return front
	 * @return : we are deleting and returning the front element
	 */
	
	public int dequeu() {
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		int front = head.data;
		if ( head == tail) {
			tail = null;
		}
		head = head.next;
		return front;
	}
	/**creating method to display the front/head value
	 * 
	 * @return 
	 */
	public int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}	

}
