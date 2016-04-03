package day3.examples;

public class BaseClass {
	
	int a,b,c;
		
	public static void main (String[] args){
		BaseClass b1 = new BaseClass();
		b1.a = 1;
		b1.b = 2;
		b1.c = 3;
		
		AddClass a1 = new AddClass();
		SubClass s1 = new SubClass();
		DivClass d1 = new DivClass();
		
		System.out.println(a1.addFn(b1));
		System.out.println(a1.addFn(10,12,13));
		System.out.println(a1.addFn(10));
		System.out.println(s1.subFn(b1));
		System.out.println(d1.divFn(b1));
		
		Coll c =new Coll();
		c.printDetails();
		
		MultipleInheritance m = new MultipleInheritance();
		
		m.getStudentName();
		m.getTeacherName();
		
		//Normal Iterface way
		StudentObject o = new StudentObject();
		
		o.getStudentName();
		
	}
	
}
