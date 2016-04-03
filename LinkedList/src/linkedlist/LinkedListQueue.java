package linkedlist;

public class LinkedListQueue {

	LinkedList queue;
	
	public LinkedListQueue(){
		queue = new LinkedList();
	}
	
	public void addToQueue(String stringInput){
		queue.frontInsert(stringInput);
	}
	
	public void processQueue(){
		//Find the last element.
		String itemToBeRemoved = getLastElement();
		queue.removeNode(itemToBeRemoved);
		System.out.println("Item removed from Queue : "+itemToBeRemoved);
	}

	private String getLastElement() {
		String lastElement = queue.getLastElement();
		return lastElement;
	}
}
