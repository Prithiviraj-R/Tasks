package mainlayertask2;
import task2.StringBuilderTask;
import java.util.Scanner;
public class OutputLayerTask2
{
public static void main(String[] args)
{
StringBuilderTask task2=new StringBuilderTask();

try
{
Scanner input=new Scanner(System.in);
System.out.println("Enter the Choice");
int choice=Integer.parseInt(input.nextLine());
switch(choice)
{
case 1:
    System.out.println("Enter the String");
    String inputString1=input.nextLine();
    try
    {
        StringBuilder emptyone=task2.createStringBuilder();
        int length=task2.lengthOfStringBuilder(emptyone);
        System.out.println("Length:"+length);
        StringBuilder loadedone=task2.appendedString(emptyone,inputString1);
        System.out.println("loadedbuilder:"+loadedone);
        int lengthOfLoadedOne=task2.lengthOfStringBuilder(loadedone);
        System.out.println("length of New builder:"+lengthOfLoadedOne);
    }
    catch(Exception error_1)
    {
        System.out.println("Enter the valid input"+error_1.getMessage());
    }
    break;
    
case 2:
 try
    {
    System.out.println("Enter the String:");
    String inputString2=input.nextLine();
    StringBuilder withLoadedString=task2.createStringBuilderWithInput(inputString2);
    System.out.println("StringBuilder with string:"+withLoadedString);
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(withLoadedString));
    System.out.println("Enter the Number");
    int inputNumber=Integer.parseInt(input.nextLine());
    if(inputNumber<=0)
    {
       System.out.println("number should not be zero or negative");
    }
    else
    {
    String[] inputArray=new String[inputNumber];
    for(int i=0;i<inputNumber;i++)
    {
       System.out.println("Enter the Strings");
       inputArray[i]=input.nextLine();
    }
    try
    { 
      System.out.println("Enter the symbol");
      String symbol1=input.nextLine();
      System.out.println(task2.insertSymbol(withLoadedString,inputArray,symbol1));
      System.out.println("Length:"+task2.lengthOfStringBuilder(withLoadedString));
    }
    catch(Exception error_2)
    {
         System.out.println("Enter The Valid input."+error_2.getMessage());
    }
    }
    }
    catch(Exception error2)
    {
         System.out.println("Enter the valid input");
    }    
    break;

case 3:
    System.out.println("Enter the string:");
    String inputString_1=input.nextLine();
    try
    {
    StringBuilder str1=task2.createStringBuilderWithInput(inputString_1);
    System.out.println("How many Strings you want after the first String?:");
    int inputNumber3=Integer.parseInt(input.nextLine());
    System.out.println("which Symbol you want to insert between Strings?:");
    String symbol3=input.nextLine();
    if(inputNumber3<=0)
    {
       System.out.println("number should not be zero or negative");
    }
    else
    {
    String[] inputArrayForCase3=new String[inputNumber3];
    for(int i=0;i<inputNumber3;i++)
    {
       System.out.println("Enter the Strings");
       inputArrayForCase3[i]=input.nextLine();
    }
    System.out.println("StringBuilder with three inputs:"+task2.insertSymbol(str1,inputArrayForCase3,symbol3));
    System.out.println("length of the StringBuilder:"+task2.lengthOfStringBuilder(str1));
    System.out.println("Inserting string:");
    String inputString_3=input.nextLine();
    StringBuilder insertedOne=task2.insertString(str1,inputString_1,inputString_3,symbol3);
    System.out.println("Inserted stringBuilder:"+insertedOne);
    System.out.println(task2.lengthOfStringBuilder(insertedOne));
    System.out.println("length after:"+task2.lengthOfStringBuilder(str1));
    }
    }
    catch(Exception error_3)
    {
       System.out.println("Enter the valid Input."+error_3.getMessage());
    }
    break;
case 4:
try
    {
    System.out.println("Enter the string:");
    String case4inputString1=input.nextLine();
    StringBuilder str2=task2.createStringBuilderWithInput(case4inputString1);
    System.out.println("How many Strings you want?");
    int inputNumber4=Integer.parseInt(input.nextLine());
    if(inputNumber4<=0)
    {
       System.out.println("number should not be zero or negative");
    }
    else
    {
    String[] inputArrayForCase4=new String[inputNumber4];
    for(int i=0;i<inputNumber4;i++)
    {
       System.out.println("Enter the Strings");
       inputArrayForCase4[i]=input.nextLine();
    }
    System.out.println("StringBuilder with three inputs:"+task2.insertSymbol(str2,inputArrayForCase4," "));
    System.out.println("Length before:"+task2.lengthOfStringBuilder(str2));
    System.out.println(task2.deleteString(case4inputString1,str2));
    System.out.println("Length after:"+task2.lengthOfStringBuilder(str2));
    }
    }
    catch(Exception error_3)
    {
       System.out.println("Enter the valid Input."+error_3.getMessage());
    }
    break;  

case 5:
 try
    {
    System.out.println("Enter the string:");
    String string1=input.nextLine();
    StringBuilder str4=task2.createStringBuilderWithInput(string1);
    System.out.println("how many Strings you want:");
    int inputNumber5=Integer.parseInt(input.nextLine());
    System.out.println("Which symbol is in the strings?:");
    String symbol1=input.nextLine();
    if(inputNumber5<=0)
    {
       System.out.println("number should not be zero or negative");
    }
    else
    {
    String[] inputArrayCase5=new String[inputNumber5];
    for(int i=0;i<inputNumber5;i++)
    {
       System.out.println("Enter the Strings");
       inputArrayCase5[i]=input.nextLine();
    }
    System.out.println("StringBuilder with three inputs:"+task2.insertSymbol(str4,inputArrayCase5,symbol1));
    System.out.println("Enter the Symbol:");
    char symbol2=input.nextLine().charAt(0);
    System.out.println("Stringbuilder with Desired output:"+task2.replaceSpace(str4,symbol1.charAt(0),symbol2));
    System.out.println("Length:"+task2.lengthOfStringBuilder(str4));
    }
    }
    catch(Exception error_4)
    {
       System.out.println("Enter the valid input."+error_4.getMessage());
    }
    break;

case 6:
    try
    {
    System.out.println("Enter the string:");
    String case6string1=input.nextLine();
    StringBuilder str5=task2.createStringBuilderWithInput(case6string1);
    System.out.println("how many Strings you want:");
    int inputNumber6=Integer.parseInt(input.nextLine());
    System.out.println("which symbol is in between the Strings:");
    String case6Symbol=input.nextLine();
    if(inputNumber6<=0)
    {
       System.out.println("number should not be zero or negative");
    }
    else
    {
    String[] inputArrayCase6=new String[inputNumber6];
    for(int i=0;i<inputNumber6;i++)
    {
       System.out.println("Enter the Strings");
       inputArrayCase6[i]=input.nextLine();
    }
    System.out.println("StringBuilder with three inputs:"+task2.insertSymbol(str5,inputArrayCase6,case6Symbol));
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(str5));
    System.out.println(task2.reverseString(str5));
    System.out.println("Length after:"+task2.lengthOfStringBuilder(str5));
    }
    }
    catch(Exception error_6)
    {
       System.out.println("Enter the valid Input."+error_6.getMessage());
    }
    break;
    
case 7:
    System.out.println("Enter the string:");
    String case7String1=input.nextLine();
    try
    {
    System.out.println("Enter the StartingPosition:");
    int case7Number1=Integer.parseInt(input.nextLine());
    System.out.println("Enter the EndingPosition:");
    int case7Number2=Integer.parseInt(input.nextLine());
    try
    {
    StringBuilder str7=task2.createStringBuilderWithInput(case7String1);
    System.out.println("String builder with single input:"+str7);
    System.out.println("Length of the stringbuilder:"+task2.lengthOfStringBuilder(str7));
    System.out.println(task2.deleteCharacters(str7,case7Number1-1,case7Number2));
    System.out.println("length after:"+task2.lengthOfStringBuilder(str7));
    }
    catch(Exception error_7)
    {
      System.out.println("Enter valid input."+error_7.getMessage());
    }
    }
    catch(Exception error_7)
    {
       System.out.println("Enter the valid number.");
    }
    break;
    
case 8: 
    System.out.println("Enter the string:");
    String case8String1=input.nextLine();
    System.out.println("Enter the Replacingstring:");
    String case8String2=input.nextLine();
    try
    {
    System.out.println("Enter the StartingPosition:");
    int case8Number1=Integer.parseInt(input.nextLine());
    System.out.println("Enter the EndingPosition:");
    int case8Number2=Integer.parseInt(input.nextLine());
    try
    {
    StringBuilder str7=task2.createStringBuilderWithInput(case8String1);
    System.out.println("stringbuilder with minimum 10 characters:"+str7);
    System.out.println("Length"+task2.lengthOfStringBuilder(str7));
    System.out.println(task2.replaceCharacters(str7,case8String2,case8Number1-1,case8Number2));
    System.out.println("length after:"+task2.lengthOfStringBuilder(str7));
    }
    catch(Exception error_8)
    {
       System.out.println("Enter the valid Input."+error_8.getMessage());
    }
    }
    catch(Exception error_8)
    {
 System.out.println("Enter the valid number");
    }
    break;  

case 9:
    try
    {
    System.out.println("Enter the string:");
    String case9String1=input.nextLine();
    StringBuilder str8=task2.createStringBuilderWithInput(case9String1);
    System.out.println("Enter the number of strings after the first String:");
    int inputNumber9=Integer.parseInt(input.nextLine());
    String[] inputArrayForCase9=new String[inputNumber9];
    for(int i=0;i<inputNumber9;i++)
    {
       System.out.println("Enter the Strings");
       inputArrayForCase9[i]=input.nextLine();
    }
    System.out.println("Symbol or letter Which has to be in between the Strings:");
    String case9Symbol=input.nextLine();
    System.out.println("StringBuilder with Desired input:"+task2.insertSymbol(str8,inputArrayForCase9,case9Symbol));
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(str8));
    System.out.println("Which one First occurance you want?");
    String case9Symbol2=input.nextLine();
    System.out.println("Index number of the asked one:"+task2.indexOfString(str8,case9Symbol2));
    }
    catch(Exception error_9)
    {
       System.out.println("Enter the valid Input."+error_9.getMessage());
    }
    break;
case 10:
try
    {
    System.out.println("Enter the string:");
    String case10String1=input.nextLine();
    StringBuilder str9=task2.createStringBuilderWithInput(case10String1);
    System.out.println("Enter the number of strings after the first String:");
    int inputNumber10=Integer.parseInt(input.nextLine());
    String[] inputArrayForCase10=new String[inputNumber10];
    for(int i=0;i<inputNumber10;i++)
    {
       System.out.println("Enter the Strings");
       inputArrayForCase10[i]=input.nextLine();
    }
    System.out.println("Symbol or letter Which has to be in between the Strings:");
    String case10Symbol=input.nextLine();
    System.out.println("Stringbuilder with symbol:"+task2.insertSymbol(str9,inputArrayForCase10,case10Symbol));
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(str9));
    System.out.println("Which one's lastOccurance you want");
    String case10Symbol2=input.nextLine();
    System.out.println(task2.lastIndexOfString(str9,case10Symbol2));
    }
    catch(Exception error_10)
    {
       System.out.println("Enter the valid Input."+error_10.getMessage());
    }
    break;
default:
     System.out.println("Enter the Correct choice");
     break;
}
}
catch(Exception Error)
{
  System.out.println("Enter the valid input");
}

}
}
