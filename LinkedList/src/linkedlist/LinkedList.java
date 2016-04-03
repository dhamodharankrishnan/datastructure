package linkedlist;

public class LinkedList {

	//Start Reference Node.
	Node start;

	/**
	 * @param stringInput
	 */
	public void frontInsert(String stringInput){
		Node newNode = new Node(stringInput);

		//If start is null, insert as first node.
		if(start == null){
			start = newNode;
		}else{
			newNode.nextNode = start;
			start = newNode;
		}
		
		print();
	}
	
	
	/**
	 * Insert data Nodes in the end of the list.
	 * 
	 * @param stringInput
	 */
	public void endInsert(String stringInput) {
		Node newNode = new Node(stringInput);
		
		//If start is null, insert as first node.
		if(start == null){
			start = newNode;
		}else{
			
			//Traverse to the end of the list.

			//for( Initialization ; Check condition ; Increment )
			Node temp = start;
			for(; temp.nextNode != null; temp = temp.nextNode );
			
			//Insert at the end.
			temp.nextNode = newNode;
		}
	}

	public void middleInsert(String stringInput){
		Node newNode = new Node(stringInput);
		if(start == null){
			start = newNode;
		}else{
			//Traverse until the newNode->data is greater than temp->data.
			Node temp = start;
 			Node prev = start;
			for(; 
					temp != null; 
					prev = temp, temp = temp.nextNode){
				
				if(stringInput.compareTo(temp.data) < 0){
					break;
				}
				
			}
			
			//End Insert
			if(temp  == null){
				prev.nextNode = newNode;
			}else{
				newNode.nextNode = temp;
				if(prev != temp){
					prev.nextNode = newNode;
				}else{
					//Since prev = temp, point start node to the newNode. Front Insert.
					start = newNode;
				}

			}

		}
		
		print();
	}
	
	public void print(){
		System.out.println();
		if(start == null){
			System.out.println("List is empty!");
		}else{
			for(Node temp = start; temp != null; temp = temp.nextNode ){
				System.out.print(temp.data +" -> ");
			}
		}
	}
	
	public void removeNode(String stringInput){
		if(start == null){
			System.out.println("Linked list is empty!");
		}
		
		Node temp = start;
		Node prev = start;
		
		for(;
				temp != null;
				prev = temp, temp = temp.nextNode){
			if(stringInput.equals(temp.data)){
				break;
			}
		}
		
		if(temp == null){
			System.out.println("Given data is not found in the list!");
		}else{
			if(prev != temp){
				prev.nextNode = temp.nextNode;
			}else{
					start = temp.nextNode;
			}
		}
		print();
	}


	public String getLastElement() {
		Node temp = start;
		for(; temp.nextNode != null; temp = temp.nextNode );
		return temp.data;
	}


	public String getFirstElement() {
		if(start == null){
			System.out.println("List is empty");
			return null;
		}
		String returnData = start.data;
		//start = start.nextNode;
		
		//print();
		return returnData;
	}


	
}
