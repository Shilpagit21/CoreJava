package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FILEOPERATIONS {
	
public static void main(String[] args)  {
	//todo auto generated method stub
	
	FileOutputStream fileOutputStream;
	
	try {
		
		fileOutputStream = new FileOutputStream("abc.txt");
				String msg = "Welcome to java";
		
		byte byteArray[] = msg.getBytes(); //converting string into byte array and method is getBytes
		
		fileOutputStream.write(byteArray);
		
		System.out.println("message written to file successfully");
	} catch (FileNotFoundException e)  {
		System.out.println("File not found");
		
	} catch (IOException e)  {
		
		//todo auto generated catch block
		System.out.println("IO Exception");
	}
}
}
