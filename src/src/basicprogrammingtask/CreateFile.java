package basicprogrammingtask;

import java.io.*;
import java.util.*;
public class CreateFile {
 public static void main(String[] args) throws IOException
 {
	 try
	 {
		 File myObj=new File("/home/inc4/myDirectory/sample.txt");
		 myObj.mkdir();
		 if (myObj.createNewFile())
		 {
		    System.out.println("File created:"+myObj.getName());
		 }
		 else
		 {
			 System.out.println("File already exists.");
		 }
	 }
	 catch(IOException e)
	 {
	   System.out.println("An Error Occured");
	   e.printStackTrace();
	 }
	 
} 
       }
      
 

