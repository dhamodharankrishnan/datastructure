package linkedlist;

public abstract class PolyExprList<T> {

	//Start Reference Node.
	PolyNode<T> start;

	/**
	 * @param stringInput
	 */
	public void frontInsert(T dataInput){
		PolyNode<T> newNode = new PolyNode<T>(dataInput);

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
	 * @param dataInput
	 */
	public void endInsert(T dataInput) {
		PolyNode<T> newNode = new PolyNode<T>(dataInput);
		
		//If start is null, insert as first node.
		if(start == null){
			start = newNode;
		}else{
			
			//Traverse to the end of the list.

			//for( Initialization ; Check condition ; Increment )
			PolyNode<T> temp = start;
			for(; temp.nextNode != null; temp = temp.nextNode );
			
			//Insert at the end.
			temp.nextNode = newNode;
		}
	}

	public void middleInsert(T dataInput){
		PolyNode<T> newNode = new PolyNode<T>(dataInput);
		if(start == null){
			start = newNode;
		}else{
			//Traverse until the newNode->data is greater than temp->data.
			PolyNode<T> temp = start;
			PolyNode<T> prev = start;
			for(; 
					temp != null; 
					prev = temp, temp = temp.nextNode){
				
				if(compareTo(newNode, temp) < 0){
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
	
	public abstract int compareTo(PolyNode<T> newNode, PolyNode<T> temp);
	
	public void print(){
		System.out.println();
		if(start == null){
			System.out.println("List is empty!");
		}else{
			for(PolyNode<T> temp = start; temp != null; temp = temp.nextNode ){
				System.out.print(temp.data +" -> ");
			}
		}
	}
	
	public void removeNode(T dataInput){
		if(start == null){
			System.out.println("Linked list is empty!");
		}
		
		PolyNode<T> temp = start;
		PolyNode<T> prev = start;
		
		for(;
				temp != null;
				prev = temp, temp = temp.nextNode){
			if(dataInput.equals(temp.data)){
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



	public T getLastElement() {
		PolyNode<T> temp = start;
		for(; temp.nextNode != null; temp = temp.nextNode );
		return temp.data;
	}


	public T getFirstElement() {
		if(start == null){
			System.out.println("List is empty");
			return null;
		}
		T returnData = start.data;

		return returnData;
	}
	
}
