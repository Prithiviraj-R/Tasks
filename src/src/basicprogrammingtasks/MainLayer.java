package basicprogrammingtasks;
import java.io.File;
import util.HelperUtil;
import java.io.IOException;
import java.util.*;
public class MainLayer 
{
	public void case1() throws CustomException
	{
	  Scanner input=new Scanner(System.in);
      LogicalLayer task=new LogicalLayer();
	  System.out.println("File creation.");
  	  System.out.println("Enter the Path");
  	  String path=input.nextLine();
  	  System.out.println("Enter the fileName");
  	  String fileName=input.nextLine();
  	  boolean flag=reWrite();
  	  System.out.println("How many strings you want:");
	  int count=Integer.parseInt(input.nextLine());
  	  String[] strArray=new String[count];
  	  for(int i=0;i<count;i++)
  	  {  
        System.out.println("Enter the String");
  	  strArray[i]=input.nextLine();
  	  }
  	  task.createFile(path,fileName,flag,strArray);	
	}
	public void case2()throws CustomException
	{
		Scanner input=new Scanner(System.in);
		LogicalLayer task=new LogicalLayer();
		System.out.println("Properties");
		Properties properties=new Properties();
	    System.out.println("Enter the path:");
	    String path1=input.nextLine();
	    System.out.println("Enter the FileName:");
	    String fileName1=input.nextLine();
	    boolean flag=reWrite();
	    System.out.println("How many keys and values you want:");
	    int number=Integer.parseInt(input.nextLine());
	    for(int i=0;i<number;i++)
		  {
			  System.out.println("Enter the key:");
			  String key=input.nextLine();
			  System.out.println("Enter the values");
			  String values=input.nextLine();
		      task.writeFileUsingProperties(path1,fileName1,flag,key,values,properties);	  
		  }
	}
	public void case3()throws CustomException
	{
		  Scanner input=new Scanner(System.in);
		  LogicalLayer task=new LogicalLayer();
		  System.out.println("Read the file and return Content to property");
		  Properties myProp=new Properties();
		  System.out.println("Enter the path");
		  String path3=input.nextLine();
		  System.out.println("Enter the fileName");
		  String fileName3=input.nextLine();
		  System.out.println("Content in the File to properties: "
		  +task.readFileUsingProperties(path3, fileName3,myProp));  
		  
	}  
	public boolean reWrite()throws CustomException
	{
		Scanner input=new Scanner(System.in);
		System.out.println("If you want to rewrite the content(Say true or false)");
		try {
	  	  boolean check=input.nextBoolean();
	  	  return check;
		}
		catch(Exception exception)
		{
	  	  throw new CustomException(exception);
		} 
	}
	public static void main(String[] args) throws CustomException
	{
      Scanner input=new Scanner(System.in);
      LogicalLayer task=new LogicalLayer();
      MainLayer cusObj=new MainLayer();
      try
      {
      System.out.println("Enter the Choice");
      int choice=Integer.parseInt(input.nextLine());
      switch(choice)
      {
      case 1:
    	  try
    	  {
    	    cusObj.case1();
          }
    	  catch(CustomException e)
    	  {
    		  System.out.println(e.getMessage());
    	  }
    	  catch(Exception error)
    	  {
    		  System.out.println("Enter the number only.");
    	  }
    	  break;
      case 2:
    	  try
    	  {
    		  cusObj.case2();
    	  }
    	  catch(CustomException e)
    	  {
    		  System.out.println(e.getMessage());
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("Enter the valid input.");
    	  }
    	  break;
      case 3:
    	  try
    	  {
    		  cusObj.case3();
    	  }
    	  catch(CustomException e)
    	  {
    		  System.out.println(e.getMessage());
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("Enter the valid input.");
    	  }
    	  break;
      case 4:
    	  try
    	  {   
    		  System.out.println("Create the Directory and repeat the above three case.");
    		  System.out.println("Enter the path:");
    		  String path=input.nextLine();
    		  System.out.println("Enter the directory name:");
    		  String directoryName=input.nextLine();
    		  task.createDirectory(path, directoryName);
    		  cusObj.case1();
    		  cusObj.case2();
              cusObj.case3();
    	  }
    	  catch(Exception e)
    	  {
               System.out.println("Enter the valid input.");
    	  }
    	  break;
      case 5:
    	  try
    	  {
    		  System.out.println("Print the name by using object:");
    		  String name=input.nextLine();
    		  LogicalLayer task1=new LogicalLayer(name);
    		  System.out.println(task1);
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("Enter the valid input");
    	  }
    	  break;
      case 6:
    	  try
    	  {
    		  System.out.println("Enter the Studentname:");
    		  String studentName=input.nextLine();
    		  System.out.println("Enter the id");
    		  int id=Integer.parseInt(input.nextLine());
    		  StudentDetails student1=new StudentDetails(studentName,id);
    		  System.out.println(student1);
    	  }
    	  catch(Exception ex)
    	  {
    		  System.out.println("Enter the valid input.");
    	  }
    	  break;
      case 7:
    	  try
    	  {
    		  System.out.println("Enter the Studentname:");
    		  String studentName=input.nextLine();
    		  System.out.println("Enter the id");
    		  int id=Integer.parseInt(input.nextLine());
    		  StudentDetails student1=new StudentDetails();
    		  student1.setStudentName(studentName);
    		  student1.setId(id);
    		  System.out.println("Student Name:"+student1.getStudentName()+
    				  ",Id:"+student1.getId());
    	  }
    	  catch(Exception ex)
    	  {
    		  System.out.println("Enter the valid input.");
    	  }
    	  break;
     default:
    	 System.out.println("Enter the correct number.");
      }
      }
      catch(Exception e)
      {
    	  System.out.println("Enter the number only");
      }
	}
}

