package sort;

public class QuickSort {

	void print(int array[] ){
		System.out.println("Printing Array...");
		for(int i=0; i< array.length;i++){
			System.out.print(array[i] +",");
		}
		System.out.println("");
	}
	
	public void sort(int array[], int startPosition, int endPosition){
		print(array);
		if(startPosition < endPosition){
			int partitionPos = partition(array, startPosition, endPosition+1);
			sort(array, startPosition, partitionPos-1);
			sort(array, partitionPos+1, endPosition);
		}
	}

	private int partition(int[] array, int startPosition, int endPosition) {
		
		int pivotalElement = array[startPosition];
		int iCount = startPosition;
		int jCount = endPosition;
		
		//outer loop starts.
		do{
			do{
				iCount++;
			}while(iCount < endPosition && array[iCount] <= pivotalElement);
			
			do{
				jCount--;
			}while(jCount > startPosition && array[jCount] >= pivotalElement);
			
			System.out.println("Before Interchange");
			print(array);
			if(iCount < jCount){
				interchange(array, iCount, jCount);
			}
			System.out.println("After Interchange");
			print(array);

			
		}while(iCount <= jCount);

		System.out.println("Before Pivotal Interchange");
		print(array);
		//Swap pivotal element
		interchange(array, startPosition, jCount);
		System.out.println("After Pivotal Interchange");
		print(array);

		//outer loop ends.
		return jCount;
	}

	private void interchange(int[] array, int iCount, int jCount) {

		int temp = array[iCount];
		array[iCount] = array[jCount];
		array[jCount] = temp;
	}
	
}
