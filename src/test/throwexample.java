package test;

public class throwexample {
	public static void main(String[] args) {
		//todo auto generated method stub
		
		try {
			
		int age = 10;
		
		if(age<18) 
			
		{
			
			throw new ArithmeticException("Age is not valid");
			
		} else 
		
		       {
				
				System.out.println("eligible for voting");
			   }
		
	} catch(ArithmeticException e) {
		
		        System.out.println("EXCEPTION HANDLED");
	}

}
	
}
