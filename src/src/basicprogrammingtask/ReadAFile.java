package basicprogrammingtask;
import java.io.*;
import java.util.*;
public class ReadAFile
{
public static void main(String[] args)
{
	try
	{
	File myObj=new File("/home/inc4/myDirectory/sample.txt");                   
	Scanner myReader=new Scanner(myObj);
	while(myReader.hasNextLine())
	{
		String data=myReader.nextLine();
		System.out.println(data);
	}
	myReader.close();
}
catch(FileNotFoundException e)
{
	System.out.println("An error occured.");
}	
}
}
