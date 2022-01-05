package runnerclass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import basicprogrammingtasks.StudentDetails;
import runnerrclass.SingletonCheck;
public class Runner
{
public static void main(String[] args)
   {
	
	
	
	try
	{
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter the choice:");
	   int choice=Integer.parseInt(input.nextLine());
	   switch(choice)
	   {
	   case 1:
	   try
	   {
	   Class className=Class.forName("basicprogrammingtasks.StudentDetails");
	   Object object=className.getDeclaredConstructor().newInstance();//used to invoke default constructor.
	   Constructor parameterConstr=className.getDeclaredConstructor(String.class,int.class);
	   System.out.println("Enter the StudentName:");
	   String inputString=input.nextLine();
	   System.out.println("Enter the Id");
	   int inputNumber=Integer.parseInt(input.nextLine());
	   Object obj2=parameterConstr.newInstance(inputString,inputNumber);//used to invoke parameter constructor.
	   System.out.println(obj2);
	   Method[] methods=className.getDeclaredMethods();//used to get methods available in class.
	   for(int i=0;i<methods.length;i++)
	   {
		   System.out.println(methods[i].getName());
	   }
	   System.out.println("Invoking getter and setter.");
	   Method myMeth=className.getDeclaredMethod("setStudentName",String.class);//used to invoke setter method.
	   System.out.println("Enter the Student name");
	   String myName=input.nextLine();
	   myMeth.invoke(object,myName);
	   Method myMeth1=className.getDeclaredMethod("getStudentName");//used to invoke getter method.
	   System.out.println("Student Name:"+myMeth1.invoke(object));
       }
	   catch(Exception e)
	   {
		  System.out.println("Program has a probelm.");
		   e.printStackTrace();
	   }
	   break;
	   case 2:
		   try
			{
				RainbowColour[] colour=RainbowColour.values();
				int i;
				for(i=0;i<colour.length;i++)
				{
					System.out.println("Colour code of "+colour[i].name()+
							" is "+colour[i].getCode());
				}
			}
		   catch(Exception e)
		   {
			   System.out.println(e.getMessage());
		   }
		   break;
		   
	   case 3:
		   System.out.println("Singleton class with Doubly checked.");
		   Singleton singletonObj=Singleton.main();
		   Singleton newObj=singletonObj.getClone();//clone check.
		   Singleton newObj2=null;
		   if(singletonObj.equals(newObj))
		   {
			   System.out.println("Equals");
		   }
		   else
		   {
			   System.out.println("Not equals");
		   }
		   try
		   {
		   Constructor[] constructor=Singleton.class.getDeclaredConstructors();//Reflection check.
				   for(Constructor construct1:constructor)
				   {
					   construct1.setAccessible(true);
					   newObj2=(Singleton)construct1.newInstance();
				   }
				   System.out.println(singletonObj);
				   System.out.println(newObj2);
				   }
		   
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
		   singletonObj.getObject();
		   break;
	   case 4:
		    System.out.println("Singleton class with enum.");
		    SingletonCheck ob=SingletonCheck.SINGLETON;
			System.out.println(ob.hashCode());
			SingletonCheck ob1=(SingletonCheck) ob.getClone();//clone check
			break;
	   default:
		   System.out.println("Enter the correct number");
	   }
   }
catch(Exception e)
{
	System.out.println("Enter the number only.");
	   
}	 
   }
}
