package test;

public class ThrowsExample {
	
	 public static void main(String[] args)  
	 {
		 //todo auto generated method stub
		 
		 ThrowsExample obj = new ThrowsExample();
		 
		 try 
		 {
			 obj.eligibility(1);
			 
		 }catch(ArithmeticException e) 
		 {
			 
			 System.out.println("Exception Handled");
		 
		 }
		 
	 }
	 
	 public void eligibility (int age) throws ArithmeticException
	 {
		 
		 
			if(age<=18) 
				
			{
				
				throw new ArithmeticException("Age is not valid");
				
			} else 
			
			       {
					
					System.out.println("eligible for voting");
				   }
	 }
	
}


