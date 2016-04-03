package linkedlist;

import java.util.TreeSet;

public class StudentComparision {

	public static void main(String args[]){
		
		
		
		Student nagaraj = new Student("Nagaraj", 23);
		Student karthik = new Student("Karthik", 25);
		
		
		if(nagaraj.mark > karthik.mark){
			System.out.println("Nagaraj has scored more than Karthik!");
		}else{
			System.out.println("Karthik has scored more than Nagaraj!");
		}
		
		
		Student students[] = new Student[3];
		students[0] = nagaraj;
		students[1] = karthik;
		students[2] = new Student("Dhamo", 45);

		Student highestMarkStudent = null;
		for(int count=0; count < students.length; count++){
			if(count ==0){
				highestMarkStudent = students[count];
			}else{
				if(students[count].mark > highestMarkStudent.mark){
					highestMarkStudent = students[count];
				}
			}
		}
		
		System.out.println("Highest mark student :"+highestMarkStudent.name);
		StudentComparator<Student> studComp = new StudentComparator<Student>();
		TreeSet<Student> studSet = new TreeSet<Student>(studComp);
		studSet.add(nagaraj);
		studSet.add(karthik);
		studSet.add(new Student("Dhamo", 45));
		
		System.out.println("Set of students :"+studSet);

		TreeSet<Student> studSetWithoutComp = new TreeSet<Student>();
		studSetWithoutComp.add(nagaraj);
		studSetWithoutComp.add(karthik);
		studSetWithoutComp.add(new Student("Dhamo", 45));
		
		System.out.println("Set of students :"+studSetWithoutComp);

	}
}
