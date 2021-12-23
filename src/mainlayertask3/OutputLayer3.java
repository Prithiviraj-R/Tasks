package mainlayertask3;
import task3.ArrayListTask;
import java.util.*;
public class OutputLayer3
{
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
   System.out.println("How many strings you want to enter:");
   int inputNumber2=Integer.parseInt(input.nextLine());
   Object[] objectArray=new Object[inputNumber2]; 
   for(int i=0;i<inputNumber2;i++)
   {
     System.out.println("Enter the Strings:");
     objectArray[i]=input.nextLine();
   }
	   try
	   {
	   List case2List2=task3.arrayListWithObject(case2List1,objectArray);
	   System.out.println("arraylist with strings:"+case2List2);
	   System.out.println("size of the list:"+task3.arrayListSize(case2List2));
	   }
	   catch(Exception exception)
	   {
	    System.out.println("Enter the valid input:"+exception.getMessage());
	   }
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
   System.out.println("How many numbers you want to enter:");
   int inputNumber3=Integer.parseInt(input.nextLine());
   Object[] objectArray3=new Object[inputNumber3]; 
   for(int i=0;i<inputNumber3;i++)
   {
     System.out.println("Enter the numbers:");
     objectArray3[i]=input.nextInt();
   }
   try
   {
   List case3List2=task3.arrayListWithObject(case3List1,objectArray3);
   System.out.println("arraylist with strings:"+case3List2);
   System.out.println("size of the list:"+task3.arrayListSize(case3List2));
   }
   catch(Exception exception)
   {
    System.out.println("Enter the valid input:"+exception.getMessage());
   }
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
   System.out.println("How many objects you want to enter:");
   int inputNumber4=input.nextInt();
   Object[] objectArray4=new Object[inputNumber4]; 
   for(int i=0;i<inputNumber4;i++)
   {
     ArrayListTask customObj=new ArrayListTask();
     objectArray4[i]=customObj;
   }
   try
   {
   List case4List2=task3.arrayListWithObject(case4List1,objectArray4);
   System.out.println("arraylist with strings:"+case4List2);
   System.out.println("size of the list:"+task3.arrayListSize(case4List2));
   }
   catch(Exception exception)
   {
    System.out.println("Enter the valid input:"+exception.getMessage());
   }
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
	   System.out.println("how many String do you want");
	   int size5=Integer.parseInt(input.nextLine());
	   if(size5<0)
	   {
	    System.out.println("Number should not be negative");
	   }
	   else
	   {
	   String[] strArray5=new String[size5];
	   for(int i=0;i<size5;i++)
	   {
	   System.out.println("Enter The string");
	   strArray5[i]=input.nextLine();
	   }
	   
	   System.out.println("how many integer do you want");
	   int size5_2=Integer.parseInt(input.nextLine());
	   if(size5_2<0)
	   {
	     System.out.println("Number should not be negative.");
	   }
	   else
	   {
	   Integer[] intArray5=new Integer[size5_2];
	   for(int i=0;i<size5_2;i++)
	   {
	    System.out.println("Enter the Integer");
	    intArray5[i]=input.nextInt();
	   }
	   
	   System.out.println("how many objects do you want");
	   int size5_3=input.nextInt();
	   if(size5_3<0)
	   {
	    System.out.println("Number should not be negative.");
	   }
	   Object objArray5[]=new Object[size5_3];
	   for(int i=0;i<size5_3;i++)
	   {
	    ArrayListTask customObject2=new ArrayListTask();
	    objArray5[i]=customObject2;
	   }
	   try
	   {
	    List list1=task3.createEmptyArrayList();
	    task3.arrayListWithObject(list1,strArray5);
	    task3.arrayListWithObject(list1,intArray5);
	    task3.arrayListWithObject(list1,objArray5);
	    System.out.println("Arraylist"+list1);
	    System.out.println("Size:"+task3.arrayListSize(list1));
	   }
	   catch(Exception exception)
	   {
	   System.out.println(exception.getMessage());
	   }
	   }
	   }
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
	  System.out.println("How many Strings you want");
	  int inputNumber6=Integer.parseInt(input.nextLine());
	  if(inputNumber6<0)
	  {
	   System.out.println("Number should not be negative.");
	  }
	  else
	  {
	  String[] array6=new String[inputNumber6];
	  for(int i=0;i<inputNumber6;i++)
	  {
	    System.out.println("Enter the Strings:");
	    array6[i]=input.nextLine();
	  }
	  List case6List2=task3.arrayListWithObject(case6List1,array6);
	  System.out.println("ArrayList:"+case6List2);
	  System.out.println("Size:"+task3.arrayListSize(case6List2));
	  System.out.println("Enter the String");
	  String inputString=input.nextLine();
	  System.out.println("Index of Given string:"+task3.findIndexNumber(case6List2,inputString));
	  }
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
	  System.out.println("How many Strings you want");
	  int inputNumber7=Integer.parseInt(input.nextLine());
	  if(inputNumber7<0)
	  {
	    System.out.println("Number should not be negative.");
	  }
	  else
	  {
	  String[] stringArray7=new String[inputNumber7];
	  for(int i=0;i<inputNumber7;i++)
	  {
	   System.out.println("Enter the Strings:");
	   stringArray7[i]=input.nextLine();
	  }
	  List case7List2=task3.arrayListWithObject(case7List1,stringArray7);
	  System.out.println("ArrayList:"+case7List2);
	  System.out.println("Size:"+task3.arrayListSize(case7List2));
	  Iterator case7List3=task3.printElementUsingIterator(case7List2);
	  for(int i=0;case7List3.hasNext();i++)
	  {
	    System.out.println(case7List3.next());
	  }
	  }
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
	  System.out.println("How many Strings you want");
	  int inputNumber8=Integer.parseInt(input.nextLine());
	  if(inputNumber8<0)
	  {
	   System.out.println("Number should not be negative");
	  }
	  else
	  {
	   String[] stringArray8=new String[inputNumber8];
	   for(int i=0;i<inputNumber8;i++)
	   {
	     System.out.println("Enter the Strings:");
	     stringArray8[i]=input.nextLine();
	   }
	  try
	  {
	    List case8List2=task3.arrayListWithObject(case8List1,stringArray8);
	    System.out.println("ArrayList:"+case8List2);
	    System.out.println("Enter the position:");
	    int position=Integer.parseInt(input.nextLine());
	    System.out.println("Element at given index:"+task3.findElementAtGivenIndex (case8List2,position-1));
	  }
	  catch(Exception exception)
	  {
	    System.out.println(exception.getMessage());
	  } 
	  }
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
	  List case9List1=task3.createEmptyArrayList();
	  System.out.println("How many Strings you want");
	  int inputNumber9=Integer.parseInt(input.nextLine());
	  if(inputNumber9<0)
	  {
	   System.out.println("Number should not be negative.");
	  }
	  else
	  {
	  String[] stringArray9=new String[inputNumber9];
	  for(int i=0;i<inputNumber9;i++)
	  {
	    System.out.println("Enter the Strings:");
	    stringArray9[i]=input.nextLine();
	  }
	  List case9List2=task3.arrayListWithObject(case9List1,stringArray9);
	  System.out.println("ArrayList:"+case9List2);
	  System.out.println("Enter the string:");
	  String stringToFind=input.nextLine();
	  System.out.println("First Occurance:"+task3.findIndexNumber(case9List2,stringToFind));
	  System.out.println("Last Occurance:"+task3.findLastIndexNumber(case9List2,stringToFind));
	  }
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
	  System.out.println("How many Strings you want");
	  int inputNumber10=Integer.parseInt(input.nextLine());
	  if(inputNumber10<0)
	  {
	    System.out.println("Number should not be negative");
	  }
	  else
	  {
	  String[] stringArray10=new String[inputNumber10];
	  for(int i=0;i<inputNumber10;i++)
	  {
	    System.out.println("Enter the Strings:");
	    stringArray10[i]=input.nextLine();
	  }
	  try
	  {
	  List case10List2=task3.arrayListWithObject(case10List1,stringArray10);
	  System.out.println("ArrayList:"+case10List2);
	  System.out.println("Enter the position:");
	  int positionToInsert=Integer.parseInt(input.nextLine());
	  System.out.println("Enter the strings:");
	  String insertString=input.nextLine();
	  System.out.println("ArrayList with added element:"+task3.addNewElement(case10List2,positionToInsert-1,insertString));
	  }
	  catch(Exception exception)
	  {
	    System.out.println(exception.getMessage());
	  }
	  }
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
	  System.out.println("How many Strings you want");
	  int inputNumber11=Integer.parseInt(input.nextLine());
	  if(inputNumber11<0)
	  {
	   System.out.println("number should not be negative");
	  }
	  else
	  {
	   String[] stringArray11=new String[inputNumber11];
	   for(int i=0;i<inputNumber11;i++)
	   {
	     System.out.println("Enter the Strings:");
	     stringArray11[i]=input.nextLine();
	   }
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
	   
	   System.out.println("How many Strings you want for first list");
	   int inputNumber12=Integer.parseInt(input.nextLine());
	   if(inputNumber12<0)
	  {
	    System.out.println("Number should not be negative");
	  }
	  else
	  {
	   String[] stringArray12=new String[inputNumber12];
	   for(int i=0;i<inputNumber12;i++)
	  {
	     System.out.println("Enter the Strings for first list:");
	     stringArray12[i]=input.nextLine();
	  }
	  
	  System.out.println("How many Strings you want for second list");
	  int inputNumber12_1=Integer.parseInt(input.nextLine());
	  if(inputNumber12_1<0)
	  {
	    System.out.println("number Should not be Negative.");
	  }
	  else
	  {
	    String[] stringArray12_1=new String[inputNumber12_1];
	    for(int i=0;i<inputNumber12_1;i++)
	    {
	     System.out.println("Enter the Strings for second list:");
	     stringArray12_1[i]=input.nextLine();
	    }
	    List case12List1=task3.createEmptyArrayList();
	    task3.arrayListWithObject(case12List1,stringArray12);
	    List case12List2=task3.createEmptyArrayList();
	    task3.arrayListWithObject(case12List2,stringArray12_1);
	   task3.addTwoArrayList(case12List1,case12List2);
	   System.out.println("Added ArrayList:"+case12List1);
	   System.out.println("Size:"+task3.arrayListSize(case12List1));
	  }
	  }
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
	   
	   System.out.println("How many Strings you want for first list");
	   int inputNumber13=Integer.parseInt(input.nextLine());
	   if(inputNumber13<0)
	   {
	     System.out.println("Number should not be Negative.");
	   }
	  else
	  {
	    String[] stringArray13=new String[inputNumber13];
	    for(int i=0;i<inputNumber13;i++)
	    {
	      System.out.println("Enter the Strings for first list:");
	      stringArray13[i]=input.nextLine();
	    }
	    
	    System.out.println("How many Strings you want for second list");
	    int inputNumber13_1=Integer.parseInt(input.nextLine());
	    if(inputNumber13_1<0)
	    {
	      System.out.println("Number should not be Negative");
	    }
	    else
	    {
	      String[] stringArray13_1=new String[inputNumber13_1];
	      for(int i=0;i<inputNumber13_1;i++)
	      {
	       System.out.println("Enter the Strings for second list:");
	       stringArray13_1[i]=input.nextLine();
	      }
	    List case13List1=task3.createEmptyArrayList();
	    task3.arrayListWithObject(case13List1,stringArray13);
	    List case13List2=task3.createEmptyArrayList();
	    task3.arrayListWithObject(case13List2,stringArray13_1);
	    task3.addTwoArrayList(case13List2,case13List1);
	    System.out.println("Added ArrayList:"+case13List2);
	    System.out.println("Size:"+task3.arrayListSize(case13List2));
	    }
	   }
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
	   Float[] floatArray15=new Float[inputNumber15];
	   for(int i=0;i<inputNumber15;i++)
	    {
	      System.out.println("Enter the Decimals:");
	      floatArray15[i]=Float.parseFloat(input.nextLine());
	    }
	   try
	   {
	    List case15List2=task3.arrayListWithObject(case15List1,floatArray15);
	    System.out.println("Enter the position of the decimal you want to delete:");
	    int positionToDelete=Integer.parseInt(input.nextLine());
	    System.out.println("ArrayList with removed Element:"+task3.removeElementsFromList(case15List2,positionToDelete-1));
	    System.out.println("Size of it:"+task3.arrayListSize(case15List2));
	   }
	   catch(Exception exception)
	   {
	     System.out.println("Enter the valid input."+exception.getMessage());
	   }
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
	  System.out.println("How many Strings you want for first list");
	  int inputNumber16=Integer.parseInt(input.nextLine());
	  if(inputNumber16<0)
	  {
	    System.out.println("Number should not be negative.");
	  }
	  else
	  {
	   String[] stringArray16=new String[inputNumber16];
	   for(int i=0;i<inputNumber16;i++)
	   {
	     System.out.println("Enter the Strings for the First list:");
	     stringArray16[i]=input.nextLine();
	   }
	  List case16List2=task3.arrayListWithObject(case16List1,stringArray16);
	  List case16List3=task3.createEmptyArrayList();
	  System.out.println("How many Strings you want for second list");
	  int inputNumber16_1=Integer.parseInt(input.nextLine());
	  if(inputNumber16_1<0)
	  {
	    System.out.println("Number should not be negative");
	  }
	  else
	  {
	   String[] stringArray16_1=new String[inputNumber16_1];
	   for(int i=0;i<inputNumber16_1;i++)
	   {
	     System.out.println("Enter the Strings for secong list:");
	    stringArray16_1[i]=input.nextLine();
	   }
	  List case16List4=task3.arrayListWithObject(case16List3,stringArray16_1);
	  List case16List5=task3.removeSameElements(case16List2,case16List4);
	  System.out.println("Desired ArrayList:"+case16List5);
	  System.out.println("Size:"+task3.arrayListSize(case16List5));
	  }
	  }
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
	   System.out.println("How many Strings you want for first List");
	   int inputNumber17=Integer.parseInt(input.nextLine());
	 
	   if(inputNumber17<0)
	   {
	     System.out.println("Number should not be negative.");
	   }
	   else
	  {
	   String[] stringArray17=new String[inputNumber17];
	   for(int i=0;i<inputNumber17;i++)
	  {
	    System.out.println("Enter the Strings for First List:");
	    stringArray17[i]=input.nextLine();
	  }
	  List case17List2=task3.arrayListWithObject(case17List1,stringArray17);
	  List case17List3=task3.createEmptyArrayList();
	  System.out.println("How many Strings you want for Second List");
	  int inputNumber17_1=Integer.parseInt(input.nextLine());
	  if(inputNumber17_1<0)
	  {
	    System.out.println("Number should not be negative");
	  }
	  else
	  {
	  String[] stringArray17_1=new String[inputNumber17_1];
	  for(int i=0;i<inputNumber17_1;i++)
	   {
	    System.out.println("Enter the Strings for Second List:");
	    stringArray17_1[i]=input.nextLine();
	   }
	  List case17List4=task3.arrayListWithObject(case17List3,stringArray17_1);
	  List case17List5=task3.retainSameElements(case17List2,case17List4);
	  System.out.println("Desired ArrayList with retained elements:"+case17List5);
	  System.out.println("Size:"+task3.arrayListSize(case17List5));
	  }
	  }
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
	  System.out.println("How many Strings you want");
	  int inputNumber19=Integer.parseInt(input.nextLine());
	  if(inputNumber19<0)
	  {
	   System.out.println("Number should not be negative.");
	  }
	  else
	  {
	  try
	  {
	  String[] stringArray19=new String[inputNumber19];
	  for(int i=0;i<inputNumber19;i++)
	  {
	    System.out.println("Enter the Strings:");
	    stringArray19[i]=input.nextLine();
	  }
	  task3.arrayListWithObject(case19List1,stringArray19);
	  System.out.println("ArrayList:"+case19List1);
	  System.out.println("Size:"+task3.arrayListSize(case19List1));
	  System.out.println("Enter the string you want to check:");
	  String stringToCheck=input.nextLine();
	  System.out.println("Is the string is present:"+task3.checkStrings(case19List1,stringToCheck));
	  }
	  catch(Exception exception)
	  {
	    System.out.println("Enter the valid input."+exception.getMessage());
	  }
	  }
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
