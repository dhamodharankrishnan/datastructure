package linkedlist;

public class LinkedListQueueImpl {

	public static void main(String args[]){
		LinkedListQueue queue = new LinkedListQueue();
		queue.addToQueue("A");
		queue.addToQueue("G");
		queue.addToQueue("J");
		queue.addToQueue("K");
		queue.processQueue();
		queue.processQueue();
		queue.processQueue();
		queue.processQueue();
		
	}
}
