package threads;

public class Driving implements Runnable {
	
	public void run() {
		System.out.println("Driving...");
		   int count=0;
	   while(count < 100){
		   System.out.println("Driving:"+count++);
	   }
	}

}
