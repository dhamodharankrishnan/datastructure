package linkedlist;

public class LinkedListImpl {

	public static void main(String args[]){
		LinkedList linkedList = new LinkedList();
		linkedList.endInsert("Salem");
		linkedList.endInsert("ChinnaSalem");
		linkedList.endInsert("Vizhupuram");
		linkedList.endInsert("Tambaram");
		linkedList.endInsert("Thiruverkadu");
		linkedList.frontInsert("E");
		linkedList.frontInsert("D");
		linkedList.frontInsert("C");
		linkedList.frontInsert("B");
		linkedList.frontInsert("A");
		linkedList.endInsert("VGN Mahalakshmi Nagar");
		linkedList.print();

	}
}
