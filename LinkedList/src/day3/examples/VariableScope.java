package day3.examples;

public class VariableScope {
	
	public static void main (String[] args){
		
		String name1 = "java";
		sayHello(name1);
	    
		sayHello("java");
		
		// MethodBasic m = new MethodBasic();
	}

	public static void sayHello(String name){
		name = " java 1";
		System.out.println("say hello : " + name);
		name = "java ee";
	}
}
