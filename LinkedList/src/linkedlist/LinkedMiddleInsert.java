package linkedlist;

public class LinkedMiddleInsert {

	public static void main(String args[]){
		LinkedList linkedList = new LinkedList();
		linkedList.middleInsert("F");
		linkedList.middleInsert("A");
		linkedList.middleInsert("B");
		linkedList.middleInsert("Z");
		linkedList.middleInsert("K");
		linkedList.middleInsert("B");
		linkedList.middleInsert("C");
		linkedList.middleInsert("D");
		linkedList.middleInsert("H");
		
		//remove node
		linkedList.removeNode("B");
		linkedList.removeNode("F");
		linkedList.removeNode("Z");
		linkedList.removeNode("A");
		linkedList.removeNode("B");
		linkedList.removeNode("C");
		linkedList.removeNode("H");
		linkedList.removeNode("D");
		linkedList.removeNode("K");
		linkedList.middleInsert("R");
	}
}
