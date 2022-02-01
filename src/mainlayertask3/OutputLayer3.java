package mainlayertask3;
import task3.ArrayListTask;
import java.util.*;
import newexception.MistakeOccuredException;
public class OutputLayer3
{
private static String[] commonCase()throws Exception
{
          Scanner input=new Scanner(System.in);
          ArrayListTask task3=new ArrayListTask();
          String[] stringArray=null;
	  System.out.println("How many Strings you want");
	  int inputNumber=Integer.parseInt(input.nextLine());
	  if(inputNumber<0)
	  {
	   System.out.println("Number should not be negative.");
	  }
	  else
	  {
          stringArray=new String[inputNumber];
	  for(int i=0;i<inputNumber;i++)
	  {
	    System.out.println("Enter the Strings:");
	    stringArray[i]=input.nextLine();
          }
          }
          return stringArray;
}

private static Object[] objectArray()throws Exception
{
   Scanner input=new Scanner(System.in);
   ArrayListTask task3=new ArrayListTask();
   Object[] objectArray=null;
   System.out.println("How many objects you want to enter:");
   int inputNumber=input.nextInt();
   if(inputNumber<0)
   {
	   System.out.println("Number should not be negative.");
   }
   else
   {
   objectArray=new Object[inputNumber]; 
   for(int i=0;i<inputNumber;i++)
   {
     ArrayListTask customObj=new ArrayListTask();
     objectArray[i]=customObj;
   }
}
return objectArray;
}

private static Integer[] intArray()throws Exception
{
   Scanner input=new Scanner(System.in);
   ArrayListTask task3=new ArrayListTask();
   Integer[] intArray=null;
   System.out.println("How many numbers you want to enter:");
   int inputNumber=Integer.parseInt(input.nextLine());
   if(inputNumber<0)
   {
	   System.out.println("Number should not be negative.");
   }
   else
  {
   intArray=new Integer[inputNumber]; 
   for(int i=0;i<inputNumber;i++)
   {
     System.out.println("Enter the numbers:");
     intArray[i]=input.nextInt();
   }
   }
  return intArray;
}
public static void main(String[] args)throws Exception
{
 ArrayListTask task3=new ArrayListTask();
 Scanner input=new Scanner(System.in);
 try
 {
 System.out.println("enter the number:");
 int choice=Integer.parseInt(input.nextLine());
 switch(choice)
 {
 
 case 1:
   System.out.println("create ArrayList and print size of it");
   List case1List1=task3.createEmptyArrayList();
   System.out.println("Arraylist is:"+case1List1);
   System.out.println("Size of it:"+task3.arrayListSize(case1List1));
   break;
 
 case 2:
   try
   {
   System.out.println("create Arraylist and add strings to it");
   List case2List1=task3.createEmptyArrayList();
   String[] objectArray=commonCase();
   List case2List2=task3.arrayListWithObject(case2List1,objectArray);
   System.out.println("arraylist with strings:"+case2List2);
   System.out.println("size of the list:"+task3.arrayListSize(case2List2));
   }
   catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
   catch(Exception exception)
   {
    System.out.println("Enter the number only.");
   }
   break;
 
 case 3:
   try
   {
   System.out.println("create Arraylist and add numbers to it");
   List case3List1=task3.createEmptyArrayList();
   Integer[] objectArray3=intArray();
   List case3List2=task3.arrayListWithObject(case3List1,objectArray3);
   System.out.println("arraylist with strings:"+case3List2);
   System.out.println("size of the list:"+task3.arrayListSize(case3List2));
   }
   catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
   catch(Exception exception)
   {
    System.out.println("Enter the number only.");
   }
   break;
   
 case 4:
   try
   {
   System.out.println("create Arraylist and add strings to it");
   List case4List1=task3.createEmptyArrayList();
   Object[] objectArray4=objectArray();
   List case4List2=task3.arrayListWithObject(case4List1,objectArray4);
   System.out.println("arraylist with strings:"+case4List2);
   System.out.println("size of the list:"+task3.arrayListSize(case4List2));
   }
   catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
   catch(Exception exception)
   {
    System.out.println("Enter the number only.");
   }
   break;  
   
 case 5:
   System.out.println("create Arraylist and add multiple dataTypes to it");
   try
   {
	   String[] strArray5=commonCase();
	   Integer[] intArray5=intArray(); 
	    Object[] objArray5=objectArray();
	    List list1=task3.createEmptyArrayList();
	    task3.arrayListWithObject(list1,strArray5);
	    task3.arrayListWithObject(list1,intArray5);
	    task3.arrayListWithObject(list1,objArray5);
	    System.out.println("Arraylist"+list1);
	    System.out.println("Size:"+task3.arrayListSize(list1));
   }
   catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
   catch(Exception exception)
   {
    System.out.println("enter a number");
   }
 break;
 
 case 6:
  System.out.println("find index of string");
  try
  {
	  List case6List1=task3.createEmptyArrayList();
	  String[] array6=commonCase();
	  List case6List2=task3.arrayListWithObject(case6List1,array6);
	  System.out.println("ArrayList:"+case6List2);
	  System.out.println("Size:"+task3.arrayListSize(case6List2));
	  System.out.println("Enter the String");
	  String inputString=input.nextLine();
	  System.out.println("Index of Given string:"+task3.findIndexNumber(case6List2,inputString));
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input.");
  }
  break;
 
 case 7:
  System.out.println("Add String and print it using iterator method");
  try
  {
	  List case7List1=task3.createEmptyArrayList();
	  String[] stringArray7=commonCase();
	  List case7List2=task3.arrayListWithObject(case7List1,stringArray7);
	  System.out.println("ArrayList:"+case7List2);
	  System.out.println("Size:"+task3.arrayListSize(case7List2));
	  Iterator case7List3=task3.printElementUsingIterator(case7List2);
	  for(int i=0;case7List3.hasNext();i++)
	  {
	    System.out.println(case7List3.next());
	  }
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
   System.out.println("Enter the valid input.");
  }
  break;  
 
 case 8:
  System.out.println("Print the element at given index");
  try
  {
	  List case8List1=task3.createEmptyArrayList();
	  String[] stringArray8=commonCase();
	    List case8List2=task3.arrayListWithObject(case8List1,stringArray8);
	    System.out.println("ArrayList:"+case8List2);
	    System.out.println("Enter the position:");
	    int position=Integer.parseInt(input.nextLine());
	    System.out.println("Element at given position:"+task3.findElementAtGivenIndex (case8List2,position-1));
	  
	  }
   catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
 
  catch(Exception exception)
  {
    System.out.println("Enter the valid input.");
  }
  break;

 case 9:
  System.out.println("First and last index of given string");
  try
  {       
          List list1=task3.createEmptyArrayList();
          String[] stringArray=commonCase();
	  List case9List2=task3.arrayListWithObject(list1,stringArray);
	  System.out.println("ArrayList:"+case9List2);
	  System.out.println("Enter the string:");
	  String stringToFind=input.nextLine();
	  System.out.println("First Occurance:"+task3.findIndexNumber(case9List2,stringToFind));
	  System.out.println("Last Occurance:"+task3.findLastIndexNumber(case9List2,stringToFind));
	  
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid number");
  }
  break;

 case 10:
  System.out.println("add string at specific position");
  try
  {
	  List case10List1=task3.createEmptyArrayList();
	  String[] stringArray10=commonCase();
	  List case10List2=task3.arrayListWithObject(case10List1,stringArray10);
	  System.out.println("ArrayList:"+case10List2);
	  System.out.println("Enter the position:");
	  int positionToInsert=Integer.parseInt(input.nextLine());
	  System.out.println("Enter the strings:");
	  String insertString=input.nextLine();
	  System.out.println("ArrayList with added element:"+task3.addNewElement(case10List2,positionToInsert-1,insertString));
	
	  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input.");
  }
  break;
 
 case 11:
  System.out.println("");
  try
  {
	  List case11List1=task3.createEmptyArrayList();
	  String[] stringArray11=commonCase();
	   task3.arrayListWithObject(case11List1,stringArray11);
	   System.out.println("ArrayList:"+case11List1);
	   System.out.println("Enter the Starting position:");
	   int startPosition=Integer.parseInt(input.nextLine());
	   System.out.println("Enter the Ending position:");
	   int endPosition=Integer.parseInt(input.nextLine());
	   List case11List2=task3.createSubList(case11List1,startPosition-1,endPosition);
	   System.out.println("ArrayList from main list:"+case11List2);
	   System.out.println("Size:"+task3.arrayListSize(case11List2));
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input");
  }
  break;

 case 12:
  System.out.println("add Two ArrayList");
  try
  {
	   
	  String[] stringArray12=commonCase();
	  String[] stringArray12_1=commonCase();
	  List case12List1=task3.createEmptyArrayList();
	  task3.arrayListWithObject(case12List1,stringArray12);
	  List case12List2=task3.createEmptyArrayList();
	  task3.arrayListWithObject(case12List2,stringArray12_1);
	  task3.addTwoArrayList(case12List1,case12List2);
	  System.out.println("Added ArrayList:"+case12List1);
	  System.out.println("Size:"+task3.arrayListSize(case12List1));
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input.");
  }
  break;

 case 13:
  System.out.println("add Two ArrayList");
  try
  {
	   
	    String[] stringArray13=commonCase();
	    String[] stringArray13_1=commonCase();
	    List case13List1=task3.createEmptyArrayList();
	    task3.arrayListWithObject(case13List1,stringArray13);
	    List case13List2=task3.createEmptyArrayList();
	    task3.arrayListWithObject(case13List2,stringArray13_1);
	    task3.addTwoArrayList(case13List2,case13List1);
	    System.out.println("Added ArrayList:"+case13List2);
	    System.out.println("Size:"+task3.arrayListSize(case13List2));
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input.");
  }
  break;

 case 14:
  try
  {
	  List case14List1=task3.createEmptyArrayList();
	  System.out.println("How many decimals you want");
	  int inputNumber14=Integer.parseInt(input.nextLine());
	  if(inputNumber14<0)
	  {
	    System.out.println("number Should not be negative");
	  }
	  else
	  {
	  Float[] floatArray14=new Float[inputNumber14];
	  for(int i=0;i<inputNumber14;i++)
	   {
	     System.out.println("Enter the Decimals:");
	     floatArray14[i]=Float.parseFloat(input.nextLine());
	   }
	  List case14List2=task3.arrayListWithObject(case14List1,floatArray14);
	  System.out.println("Enter the decimal number to delete:");
	  float decimalNumber=Float.parseFloat(input.nextLine());
	  System.out.println("ArrayList with removed Element:"+task3.removeElementsFromList(case14List2,decimalNumber));
	  System.out.println("Size of it:"+task3.arrayListSize(case14List2));
	  }
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
   System.out.println("Enter the valid input.");
  }
  break;
 
 case 15:
  try
  {
	   List case15List1=task3.createEmptyArrayList();
	   System.out.println("How many decimals you want");
	   int inputNumber15=Integer.parseInt(input.nextLine());
	   if(inputNumber15<0)
	   {
	    System.out.println("Number should not be negative.");
	   }
	   else
	   {
	   Float[] floatArray15=new Float[inputNumber15];
	   for(int i=0;i<inputNumber15;i++)
	    {
	      System.out.println("Enter the Decimals:");
	      floatArray15[i]=Float.parseFloat(input.nextLine());
	    }
	    List case15List2=task3.arrayListWithObject(case15List1,floatArray15);
	    System.out.println("Enter the position of the decimal you want to delete:");
	    int positionToDelete=Integer.parseInt(input.nextLine());
	    System.out.println("ArrayList with removed Element:"+task3.removeElementsFromList(case15List2,positionToDelete-1));
	    System.out.println("Size of it:"+task3.arrayListSize(case15List2));
	   }
	   }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid number");
  }
  break;
 
 case 16:
  System.out.println("Remove same elements from ArrayList");
  try
  {
	  List case16List1=task3.createEmptyArrayList();
	  String[] stringArray16=commonCase();
	  List case16List2=task3.arrayListWithObject(case16List1,stringArray16);
	  List case16List3=task3.createEmptyArrayList();
	  String[] stringArray16_1=commonCase();
	  List case16List4=task3.arrayListWithObject(case16List3,stringArray16_1);
	  List case16List5=task3.removeSameElements(case16List2,case16List4);
	  System.out.println("Desired ArrayList:"+case16List5);
	  System.out.println("Size:"+task3.arrayListSize(case16List5));
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input");
  }
  break;
 
 case 17:
  System.out.println("Retain same elements from ArrayList");
  try
  {
	   List case17List1=task3.createEmptyArrayList();
	   String[] stringArray17=commonCase();
	  List case17List2=task3.arrayListWithObject(case17List1,stringArray17);
	  List case17List3=task3.createEmptyArrayList();
	  String[] stringArray17_1=commonCase();
	  List case17List4=task3.arrayListWithObject(case17List3,stringArray17_1);
	  List case17List5=task3.retainSameElements(case17List2,case17List4);
	  System.out.println("Desired ArrayList with retained elements:"+case17List5);
	  System.out.println("Size:"+task3.arrayListSize(case17List5));
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
   System.out.println("Enter the valid input.");
  }
  break;
 
 case 18:
  System.out.println("Clear the List:");
  try
  {
	   List case18List1=task3.createEmptyArrayList();
	   System.out.println("How many values you want");
	   int inputNumber18=Integer.parseInt(input.nextLine());
	   if(inputNumber18<0)
	   {
	    System.out.println("Number should not be negative.");
	   }
	   else
	   {
	   Long[] longArray18=new Long[inputNumber18];
	   for(int i=0;i<inputNumber18;i++)
	   {
	     System.out.println("Enter the long values:");
	     longArray18[i]=input.nextLong();
	   }
	   task3.arrayListWithObject(case18List1,longArray18);
	   System.out.println("ArrayList with long value:"+case18List1);
	   System.out.println("ArrayList without long values:"+task3.clearList(case18List1));
	   System.out.println("Size:"+task3.arrayListSize(case18List1));
	  }
  }
  catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
    System.out.println("Enter the valid input.");
  }
  break;
 
 case 19:
  System.out.println("Check the string is present or not");
  try
  {
	  List case19List1=task3.createEmptyArrayList();
	  String[] stringArray19=commonCase();
	  task3.arrayListWithObject(case19List1,stringArray19);
	  System.out.println("ArrayList:"+case19List1);
	  System.out.println("Size:"+task3.arrayListSize(case19List1));
	  System.out.println("Enter the string you want to check:");
	  String stringToCheck=input.nextLine();
	  System.out.println("Is the string is present:"+task3.checkStrings(case19List1,stringToCheck));
   }
   catch(MistakeOccuredException exception)
   {
     System.out.println(exception.getMessage());
   }
  catch(Exception exception)
  {
   System.out.println("Enter the valid Number");
  }
  break;
 
 default:
   System.out.println("Enter the Correct number.");
   break;
 }
 }  
 catch(Exception exception)
 {
   System.out.println("Enter the number only");
 }
 
 }
 
 }
