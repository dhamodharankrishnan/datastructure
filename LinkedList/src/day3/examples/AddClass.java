package day3.examples;

class AddClass {
	
	//  call method using instances
	int addFn(BaseClass b1){
		
	//	b1.a = 6;           how its allow to assign value
	//  where its return	
		return b1.a + b1.b;
	}
	
	
	//   over loading
	//   call method using argument
	
	int addFn(int a,int b, int c ){
		return a+b+c;
	}
	
	int addFn(int a){
		
		return a;
	}
	


}
