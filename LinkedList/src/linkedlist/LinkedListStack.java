package linkedlist;

public class LinkedListStack {

	private LinkedList stack;
	
	public LinkedListStack(){
		stack = new LinkedList();
	}
	
	public void push(String stringInput){
		//Front Insert
		stack.frontInsert(stringInput);
	}
	
	public void pop(){
		String data = getTopElement();
		stack.removeNode(data);
	}

	private String getTopElement() {
		return stack.getFirstElement();
	}
}

