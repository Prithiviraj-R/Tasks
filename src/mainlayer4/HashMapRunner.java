package mainlayer4;
import task4.HashMapTask;
import newexception.MistakeOccuredException;
import java.util.*;
public class HashMapRunner
{
public void numberCheck(int number)throws MistakeOccuredException
{
  if(number<0)
  {
   throw new MistakeOccuredException("Number Cannot be Negative");
  }
}
public Map<Object,Object> inputGetter()throws MistakeOccuredException
{
  HashMapTask task4=new HashMapTask();
  Scanner input=new Scanner(System.in);
  HashMapRunner myObj=new HashMapRunner();
  Map caseMap1=task4.createHashMap();
  System.out.println("How many keys and Values you have to enter:");
  int number=Integer.parseInt(input.nextLine());
  myObj.numberCheck(number);
  for(int i=0;i<number;i++)
  {
  System.out.println("Enter the "+(i+1)+"st key:");
  String caseKey=input.nextLine();
  System.out.println("Enter the "+(i+1)+"st value:");
  String caseValue=input.nextLine();
  task4.hashMapWithInputs(caseMap1,caseKey,caseValue);
  }
  return caseMap1;    
}
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
HashMapTask task4=new HashMapTask();
HashMapRunner myObj=new HashMapRunner();
try
{
System.out.println("Enter the choice");
int choice=Integer.parseInt(input.nextLine());
switch(choice)
{
case 1:
  System.out.println("Create the hashMap and print size of it");
  Map case1Map1=task4.createHashMap();
  System.out.println("Hashmap:"+case1Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case1Map1));
  break;

case 2:
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case2Map1=task4.createHashMap();
  System.out.println("How many keys and Values you have to enter:");
  int number=Integer.parseInt(input.nextLine());
  myObj.numberCheck(number);
  for(int i=0;i<number;i++)
  {
  System.out.println("Enter the "+(i+1)+"st key:");
  String case2Key=input.nextLine();
  System.out.println("Enter the "+(i+1)+"st value:");
  String case2Value=input.nextLine();
  task4.hashMapWithInputs(case2Map1,case2Key,case2Value);
  }
  System.out.println("hashMap loaded with key and value:"+case2Map1); 
  System.out.println("Size:"+task4.sizeOfHashMap(case2Map1));
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

case 3:
  try
  {
  System.out.println("Add three key(Integer) and Value(Integer)");
  Map case3Map1=task4.createHashMap();
  System.out.println("How many Keys and values you have to enter:");
  int case3Number=Integer.parseInt(input.nextLine());
  if(case3Number<0)
  {
   System.out.println("number should not be negative.");
  }
  else
  {
  for(int i=0;i<case3Number;i++)
  {
   System.out.println("Enter the "+(i+1)+"st key:");
   Integer case3key=input.nextInt();
   input.nextLine();
   System.out.println("Enter the "+(i+1)+"st value:");
   Integer case3value=input.nextInt();
   input.nextLine();
   task4.hashMapWithInputs(case3Map1,case3key,case3value);
  }
  System.out.println("Hashmap loaded with keys and value:"+case3Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case3Map1));
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
  
case 4:
  try
  {
  System.out.println("Add three key(String) and Value(Integer)");
  Map case4Map1=task4.createHashMap();
  System.out.println("How many Keys and values you have to enter:");
  int case4Number=Integer.parseInt(input.nextLine());
  if(case4Number<0)
  {
   System.out.println("number should not be negative.");
  }
  else
  {
  for(int i=0;i<case4Number;i++)
  {
   System.out.println("Enter the "+(i+1)+"st key(String):");
   String case4key=input.nextLine();
   System.out.println("Enter the "+(i+1)+"st value(Numbers):");
   Integer case4value=Integer.parseInt(input.nextLine());
   task4.hashMapWithInputs(case4Map1,case4key,case4value);
  }
  System.out.println("Hashmap loaded with keys and value:"+case4Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case4Map1));  
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
 
case 5:
  try
  {
  System.out.println("Add three key(Integer) and Value(Integer)");
  Map case5Map1=task4.createHashMap();
  System.out.println("How many Keys and values you have to enter:");
  int case5Number=Integer.parseInt(input.nextLine());
  if(case5Number<0)
  {
   System.out.println("number should not be negative.");
  }
  else
  {
  for(int i=0;i<case5Number;i++)
  {
   System.out.println("Enter the "+(i+1)+"st key:");
   Integer case5key=input.nextInt();
   input.nextLine();
   System.out.println("Enter the "+(i+1)+"st value:");
   HashMapTask customObj=new HashMapTask();
   Object case5=customObj;
   task4.hashMapWithInputs(case5Map1,case5key,case5);
  }
  System.out.println("Hashmap loaded with keys and value:"+case5Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case5Map1));  
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
case 6:
  try
  {
  System.out.println("Enter one value as a null");
  System.out.println("How many keys and values you want:");
  int case6Number=Integer.parseInt(input.nextLine());
  if(case6Number<0)
  {
    System.out.println("Number should not be Negative");
  }
  else
  {
  String caseKey="";
  String caseValue="";
  Map case6Map1=task4.createHashMap();
  for(int i=0;i<case6Number;i++)
  {
   if(i==case6Number-1)
   {
   System.out.println("Enter the "+(i+1)+"st key:");
   caseKey=input.nextLine();
   System.out.println("Enter the "+(i+1)+"st Value:");
   caseValue=null;
   }
   else
   {
   System.out.println("Enter the "+(i+1)+"st key:");
   caseKey=input.nextLine();
   System.out.println("Enter the "+(i+1)+"st Value:");
   caseValue=input.nextLine();
   }
   task4.addInputsInHashMap(case6Map1,caseKey,caseValue);
   }
   System.out.println("hashMap With Inputs:"+case6Map1);
   System.out.println("size:"+task4.sizeOfHashMap(case6Map1));
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
case 7:
  try
  {
  System.out.println("Enter one value as a null");
  System.out.println("How many keys and values you want:");
  int case7Number=Integer.parseInt(input.nextLine());
  if(case7Number<0)
  {
   System.out.println("number should not be negative.");
  }
  else
  {
  String case7Key="";
  String case7Value="";
  Map case7Map1=task4.createHashMap();
  for(int i=0;i<case7Number;i++)
  {
   if(i==case7Number-1)
   {
   System.out.println("Enter the "+(i+1)+"st key:");
   case7Key=null;
   System.out.println("Enter the "+(i+1)+"st Value:");
   case7Value=input.nextLine();
   }
   else
   {
   System.out.println("Enter the "+(i+1)+"st key:");
   case7Key=input.nextLine();
   System.out.println("Enter the "+(i+1)+"st Value:");
   case7Value=input.nextLine();
   }
   task4.addInputsInHashMap(case7Map1,case7Key,case7Value);
   }
   System.out.println("hashMap With Inputs:"+case7Map1);
   System.out.println("size:"+task4.sizeOfHashMap(case7Map1));
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
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case8Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case8Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case8Map1));
  System.out.println("Enter the key you want check:");
  String keyToCheck=input.nextLine();
  System.out.println("Key is present:"+task4.checkKey(case8Map1,keyToCheck));
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
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case9Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case9Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case9Map1));
  System.out.println("Enter the value you want check:");
  String valueToCheck=input.nextLine();
  System.out.println("Value is present:"+task4.checkValue(case9Map1,valueToCheck));
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
case 10:
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case10Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case10Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case10Map1));
  Map case10Map2=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case10Map2);
  System.out.println("Size:"+task4.sizeOfHashMap(case10Map2));
  Map case10Map3=task4.transferPairs(case10Map1,case10Map2);
  System.out.println("Map with changed Values:"+case10Map3);
  System.out.println("Size:"+task4.sizeOfHashMap(case10Map3));
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
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case11Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case11Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case11Map1));
  System.out.println("Enter the key of value that you want:");
  String keyOfValue=input.nextLine();
  System.out.println("value of Key is:"+task4.getValueOfKey(case11Map1,keyOfValue));
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

case 12:
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case12Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case12Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case12Map1));
  System.out.println("Enter the Non Existing key:");
  String nonExistingKey=input.nextLine();
  System.out.println("enter the default value:");
  String defaultValue=input.nextLine();
  System.out.println("value for non existing key:"+task4.getValueOfNonExistingKey(case12Map1,nonExistingKey,defaultValue));
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
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case13Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case13Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case13Map1));
  System.out.println("Enter the Non Existing key:");
  String nonExistingKey=input.nextLine();
  System.out.println("enter the default value:");
  String defaultValue=input.nextLine();
  System.out.println("Map After entering for non  existingkey:"+task4.returnValueForNonExistingKey(case13Map1,nonExistingKey,defaultValue));
  System.out.println("Size:"+task4.sizeOfHashMap(case13Map1));
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
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case14Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case14Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case14Map1));
  System.out.println("Enter the existing key you want to delete:");
  String keyToRemove=input.nextLine();
  task4.removeKey(case14Map1,keyToRemove);
  System.out.println("Hashmap after deletion:"+case14Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case14Map1));
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
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case15Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case15Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case15Map1));
  System.out.println("Enter the existing key you want to delete:");
  String keyToRemove=input.nextLine();
  System.out.println("Enter the value of existing key you want to delete:");
  String valueOfExistingKey=input.nextLine();
  task4.removeKey(case15Map1,keyToRemove,valueOfExistingKey);
  System.out.println("Hashmap after deletion:"+case15Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case15Map1));
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

case 16:
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case16Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case16Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case16Map1));
  System.out.println("Enter the key of value you want to change:");
  String keyOfChangingValue=input.nextLine();
  System.out.println("Enter the changing value:");
  String changingValue=input.nextLine();
  task4.replaceValue(case16Map1,keyOfChangingValue,changingValue);
  System.out.println("Hashmap after replace:"+case16Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case16Map1));
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

case 17:
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case17Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case17Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case17Map1));
  System.out.println("Enter the key of value you want to change:");
  String keyOfChangingValue=input.nextLine();
  System.out.println("Enter the old value:");
  String oldValue=input.nextLine();
  System.out.println("Enter the changing value");
  String changingValue=input.nextLine();
  task4.replaceValue(case17Map1,keyOfChangingValue,oldValue,changingValue);
  System.out.println("Hashmap after replace:"+case17Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case17Map1));
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
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case18Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case18Map1); 
  System.out.println("Size:"+task4.sizeOfHashMap(case18Map1));
  Map case18Map2=myObj.inputGetter();
  task4.transferPairs(case18Map2,case18Map1);
  System.out.println("Map with changed Values:"+case18Map2);
  System.out.println("Size:"+task4.sizeOfHashMap(case18Map2));
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
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case19Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case19Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case19Map1));
  Iterator newOne=task4.hashMapIteration(case19Map1);
  for(int i=0;newOne.hasNext();i++)
  {
   System.out.println("key and value pairs one by one:");
   System.out.println(newOne.next());
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
case 20:
  try
  {
  System.out.println("Add three pairs(Key&Value) of Strings");
  Map case20Map1=myObj.inputGetter();
  System.out.println("HashMap loaded with key and values:"+case20Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case20Map1));
  task4.clearHashMap(case20Map1);
  System.out.println("Hashmap after clear:"+case20Map1);
  System.out.println("Size:"+task4.sizeOfHashMap(case20Map1));
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

default:
  System.out.println("Enter the correct Number.");
} 

}
catch(Exception exception)
{
 System.out.println("Enter the number only.");
}

}
}
