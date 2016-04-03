package threads;

public class ThreadExample {

	public static void main(String args[]){
		Runnable driving = new Driving();
		Thread t = new Thread(driving);
		System.out.println("Before Thread start...");
		t.start();
		   int count=0;
	   while(count < 100){
		   System.out.println("Main Program:"+count++);
	   }
		
		System.out.println("After Thread end...");
	}
}
