package oopsConcepts;

public class ClassA {
	
	public int Salary;
	public String Name;
	protected String OrgName;
	
	// Default Constructor 
	public ClassA() {
		
		System.out.println("Inside Constuctor");
	}
	
	// Parameterized Constructor
	public ClassA(int val1, String val2, String val3) {
		
		System.out.println("Inside Param Constuctor");
		
		this.Salary = val1;
		this.Name = val2;
		this.OrgName = val3;
	}
	
	
	// Methods
	public void Display() {
		
		System.out.println("Name of Emp: " + Name);
		System.out.println("Name of Org: " + OrgName);
		System.out.println("Salary of Emp: " + Salary);
		
	}
	
	

}