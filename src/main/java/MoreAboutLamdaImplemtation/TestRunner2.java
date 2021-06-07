package MoreAboutLamdaImplemtation;

public class TestRunner2 {
	public static void main(String[] args) {
		// Funtional programming
				// -> (lambda expression)
				// Rules:
				// Method parameter should match
				// 1. parameter the abstract method and your lambda expression
				// 2. Return type of your abstract method and lambda expression should match
				// 3. Only one abstract and Unimplemeted method
		
		
		// Method parameter should match -- you can remove paramter string from the lambda no issue
		//								--You no need to use bracket when your mehtod have one parameter
				
		
		IPrintable obj2 = (a)->System.out.println(a);
				obj2.print("Swapnil");
				
				
				
	}
}
