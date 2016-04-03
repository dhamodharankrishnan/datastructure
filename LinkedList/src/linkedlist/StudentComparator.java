package linkedlist;

import java.util.Comparator;

public class StudentComparator<T> implements Comparator<Student>{

	public int compare(Student first, Student second) {
		if(first.mark < second.mark){
			return 1;
		}else if(first.mark > second.mark){
			return -1;
		}
		return 0;
	}

}
