package basicprogrammingtask;
import java.io.*;
public class fileInformation {
  public static void main(String[] args)
  {
	  File myObj=new File("/home/inc4/myDirectory/sample.txt");
	  if(myObj.exists())
	  {
		  System.out.println("File name:"+myObj.getName());
		  System.out.println("Absolute path:"+myObj.getAbsolutePath());
		  System.out.println("Writable:"+myObj.canWrite());
		  System.out.println("Readable"+myObj.canRead());
		  System.out.println("File size in bytes:"+myObj.length());
	  }
	  else
	  {
		  System.out.println("The file is not exist");
	  }
  }
}
