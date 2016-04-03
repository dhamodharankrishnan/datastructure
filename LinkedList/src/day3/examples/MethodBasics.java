package day3.examples;

public class MethodBasics {
	public static void main (String[] args){
		
		
		// how assigning method to integer variable 'y'
		int y = rectangleArea(5,10); 
	 System.out.println(y);
		
		
		// how its print result..???
		//System.out.println(rectangleArea(5,10));
	}
	
	public static int rectangleArea(int length, int width){
		 return length * width;
		 
		 // int y = length * width;
		 // return y;
		 
	}
	public int perimeterArea(int length, int width){
		return 2 * (length * width);
	}

}
