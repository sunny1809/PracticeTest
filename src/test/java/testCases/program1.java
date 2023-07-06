package testCases;
import org.testng.annotations.Test;

public class program1 {
	
	@Test
	public void add () {
		int a  = 12;
		int b = 4;
		
		System.out.println("This is Program1");
		System.out.println("Summation of " + a +" and " + b + " is " + (a+b));
				
	}
}
