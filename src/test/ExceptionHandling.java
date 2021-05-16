package test;

public class ExceptionHandling {

	public static void main(String[] args) {
		//todo auto generated method stub
		
		int a = 10;
		int b =  5;
		
		try {
			
			int result = a/b;
			//System.out.println("After error"); //DO NOT ADD THIS BEFORE CATCH BLOCK
			
		}catch(ArithmeticException e) {
		
		   System.out.println("ArithmeticException Handled");
		}
		
		catch(Exception e){
			
			System.out.println("Exception Handled");
		
		} finally {
			
			System.out.println("Try catch executed successfully");
		}
		
		System.out.println("After error");
		System.out.println("Hello");
	}
	
	
	
}



