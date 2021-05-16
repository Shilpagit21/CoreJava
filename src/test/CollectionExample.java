package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExample {

	 public static void main(String[] args)  {
		 //todo auto generated method stub
		 
		 ArrayList<String> mylist = new ArrayList<String>();
		 //array list
		 
		 mylist.add("May");
		 mylist.add("Auspicious");
		 mylist.add("Month");
		 mylist.add("Forever MOM AND DAD");
		 
         System.out.println("Before Sorting");
		 System.out.println(mylist);
		 
         Collections.sort(mylist);
		 
		  System.out.println("After Asc Sorting");
		  System.out.println(mylist);
		
		  Collections.sort(mylist, Collections.reverseOrder());
          System.out.println("After Dsc Sorting");
		  System.out.println(mylist);
		 
		  Stack<String> mystack = new Stack<String>();
				  
				  mystack.push("THOUGHTS");
		          mystack.push("POSITIVE");
		          mystack.pop();
		          mystack.push("ALWAYS");
		          System.out.println(mystack);        
		  
	 }
}
