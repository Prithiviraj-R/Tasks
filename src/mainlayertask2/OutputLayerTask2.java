package mainlayertask2;
import newexception.MistakeOccuredException;
import task2.StringBuilderTask;
import java.util.Scanner;
public class OutputLayerTask2
{
private static StringBuilder commonCase(StringBuilder builder) throws Exception
{
    StringBuilder str=null;
    StringBuilderTask task2=new StringBuilderTask();
    Scanner input=new Scanner(System.in);
    System.out.println("How many Strings you want after firstOne:");
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
      System.out.println("Enter the symbol");
      String symbol1=input.nextLine();
      str=task2.insertSymbol(builder,inputArray,symbol1);
    }  
    return str;
}
public static void main(String[] args) throws Exception
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
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
    }
    catch(Exception error_1)
    {
        System.out.println("Enter the valid input"+error_1.getMessage());
    }
    break;
    
case 2:
 try
    {
      System.out.println("Enter the string:");
      String inputString2=input.nextLine();
      StringBuilder withLoadedString=task2.createStringBuilderWithInput(inputString2);
      System.out.println("StringBuilder with string:"+withLoadedString);
      System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(withLoadedString));
      StringBuilder stringBuilderOutput=commonCase(withLoadedString);
      System.out.println(stringBuilderOutput);
      System.out.println("Length:"+task2.lengthOfStringBuilder(stringBuilderOutput));
    }
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    StringBuilder strBuilder1=commonCase(str2);
    System.out.println("Length before:"+task2.lengthOfStringBuilder(strBuilder1));
    System.out.println(task2.deleteString(case4inputString1,strBuilder1));
    System.out.println("Length after:"+task2.lengthOfStringBuilder(strBuilder1));
    }
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    StringBuilder strBuilder6=task2.createStringBuilderWithInput(case6string1);
    StringBuilder str5=commonCase(strBuilder6);
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(str5));
    System.out.println(task2.reverseString(str5));
    System.out.println("Length after:"+task2.lengthOfStringBuilder(str5));
    }
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    StringBuilder str7=task2.createStringBuilderWithInput(case7String1);
    System.out.println("String builder with single input:"+str7);
    System.out.println("Length of the stringbuilder:"+task2.lengthOfStringBuilder(str7));
    System.out.println(task2.deleteCharacters(str7,case7Number1-1,case7Number2));
    System.out.println("length after:"+task2.lengthOfStringBuilder(str7));
    }
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    StringBuilder str7=task2.createStringBuilderWithInput(case8String1);
    System.out.println("stringbuilder with minimum 10 characters:"+str7);
    System.out.println("Length"+task2.lengthOfStringBuilder(str7));
    System.out.println(task2.replaceCharacters(str7,case8String2,case8Number1-1,case8Number2));
    System.out.println("length after:"+task2.lengthOfStringBuilder(str7));
    }
   catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    StringBuilder strBuilder9=task2.createStringBuilderWithInput(case9String1);
    StringBuilder str8=commonCase(strBuilder9);
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(str8));
    System.out.println("Which one First occurance you want?");
    String case9Symbol2=input.nextLine();
    System.out.println("Index number of the asked one:"+task2.indexOfString(str8,case9Symbol2));
    }
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
    StringBuilder strBuilder10=task2.createStringBuilderWithInput(case10String1);
    StringBuilder str9=commonCase(strBuilder10);
    System.out.println(str9);
    System.out.println("Length of the Stringbuilder:"+task2.lengthOfStringBuilder(str9));
    System.out.println("Which one's lastOccurance you want");
    String case10Symbol2=input.nextLine();
    System.out.println(task2.lastIndexOfString(str9,case10Symbol2));
    }
    catch(MistakeOccuredException error)
    {
        System.out.println(error.getMessage());
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
