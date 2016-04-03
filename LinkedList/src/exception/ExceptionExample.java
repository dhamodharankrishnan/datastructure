package exception;

public class ExceptionExample {

	public static void main(String[] args) throws ClassNotFoundException  {

		someMethod();
	}
	
	public static void someMethod() throws ClassNotFoundException{
		int a = 6;
		int b = 5;
		System.out.println("someMethod");
		try {
			int numberValue = 10/(a-b);
			String stringValue = "abcasdfasd".substring(5);
			Class.forName("java.util.TreeSeta");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(".... Not reached...");
	}

}
