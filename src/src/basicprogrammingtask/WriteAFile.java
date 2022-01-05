package basicprogrammingtask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class WriteAFile {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		try
		{
			FileWriter myWriter=new FileWriter("/home/inc4/myDirectory/sample2.txt");
			myWriter.write(str);
			myWriter.close();
			System.out.println("Sucessfully wrote the file.");
		}
		catch(IOException e)
		{
			System.out.println("An error Occured");
			e.printStackTrace();
		}
	}

}
