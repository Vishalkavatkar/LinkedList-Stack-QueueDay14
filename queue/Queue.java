package queue;

/**
 * Main method for the Queue
 * We have called the methods in the main class
 * @author 
 *
 */

public class Queue {
	
	public static void main(String[] args) {

		/**
		 * Created a object of service class and called the method
		 */
		QueueService queue = new QueueService();
		queue.enqueu(56);
		queue.enqueu(30);
		queue.enqueu(70);

		System.out.println("Elements in the queue are : ");
		
		
		while(!queue.isEmpty()) {
			System.out.println(queue.peek());
			queue.dequeu();
		}
		
	}

}
