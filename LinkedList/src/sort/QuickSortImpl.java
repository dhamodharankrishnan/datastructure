package sort;

public class QuickSortImpl {

	public static void main(String args[]){
//		int array[] = {65,70,75,80,85,60,55,50,45};
		int array[] = {24,2,45,20,56,75,2,56,99,53,12};
//		int array[] = {10,20,30,40,50,60,70,80,90,100};
//		int array[] = {100,90,80,70,60,50,40,30,20,10};

		QuickSort quickSort = new QuickSort();
		quickSort.sort(array, 0, array.length-1);
		
		
	}
	
}
