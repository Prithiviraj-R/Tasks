package task;
import task1.StringTask;
import java.util.Scanner;
public class OutputLayer{
public static void main(String[] args){
StringTask task=new StringTask();
Scanner input=new Scanner(System.in);
System.out.println("1.Find the length of a String"+"\n"+"2.String-->character Array"+"\n"+"3.penultimate(Find the Last but one of a string)"+"\n"+"4.Find the no of occurrences of a letter"+"\n"+"5.Find the greatest position of the letter"+"\n"+"6.Print last 5 character of a String"+"\n"+"7.Print first three character of a String"+"\n"+"8.Replace first 3 character of a string with 'XYZ'"+"\n"+"9.String starts with 'ent'"+"\n"+"10.String ends with 'le'"+"\n"+"11.Lowercase-->Uppercase"+"\n"+"12.Uppercase-->Lowercase"+"\n"+"13.Reverse a string" +"\n"+"14.Multiple strings"+"\n"+"15.Single string without spaces"+"\n"+"16.Merge each String with '-'" +"\n"+"17.Two input strings are equal"+"\n"+"18.Two input strings are equal"+"\n"+"19.string with no spaces either at the beginning or end"+"\n"+"20.Enclose each string into a String array:");
System.out.println("Enter the number");
int choice=0;
try
{
   choice=Integer.parseInt(input.nextLine());

switch (choice) 
{

case 1:
   System.out.println("GetInput from Command");
   String name="";
   try
   {
     name=args[0];
     System.out.println(task.getLength(name));
   }
   catch(Exception error_1)
   {
     System.out.println("Enter valid input"+error_1.getMessage());
   }
   break;
                 
case 2:
   System.out.println("Character array");
   System.out.println("Enter the String:");
   String stringName=input.nextLine();
   try
   {
     System.out.println("This is the Required Array:");
     System.out.println(task.characterArray(stringName));
     for(char temp:task.characterArray(stringName))
     {
       System.out.println(temp);
     }
   }
   catch(Exception stringError_1)
   {
     System.out.println("Enter the valid string."+stringError_1.getMessage());
   }    
   break;
                
case 3:
   System.out.println("Finding The Letter");
   String stringName1="";
   int number_3=0;
   System.out.println("Enter the String:");
   stringName1 = input.nextLine();
   try
   {
     System.out.println("enter the position of the letter do you want?:");
     number_3=Integer.parseInt(input.nextLine());
     if(number_3<=0)
     {
           System.out.println("Entered number is negative or Zero");
     }
     else
     {
     try
     {
       System.out.println(task.findLetter(stringName1,number_3-1));
     }
     catch(Exception stringError)
     {
       System.out.println("Enter the valid input."+stringError.getMessage());
     }
     }
   }
   catch(Exception numError)
   {
     System.out.println("Enter the valid number.");
   }
   break;

case 4:
   System.out.println("Counting the Given Letters");
   String stringName2="";
   char letter=' ';
   System.out.print("Enter the word:");
   stringName2 = input.nextLine();
   try
   {
     System.out.print("enter the letter:");
     letter= input.nextLine().charAt(0);
     try
     {
       System.out.println(task.countingLetters(stringName2, letter));
     }
     catch(Exception error_1)
     {
       System.out.println("Enter the valid input"+error_1.getMessage());
     }
   }
   catch(Exception charError1)
   {
     System.out.println("Enter the valid letter");
   }
   break;
                
case 5:
   System.out.println("highest Occurances");
   String stringName3="";
   char letter1=' ';
   System.out.println("Enter the String:");
   stringName3 = input.nextLine();
   try
   {
     System.out.println("Which letter's Highest Occurances do you Want:");
     letter1 = input.nextLine().charAt(0);
     try
     {
       System.out.println(task.highestOccurances(stringName3, letter1));
     }
     catch(Exception stringError)
     {
       System.out.println("Enter the valid input."+stringError.getMessage());
     }
   }
   catch(Exception charError)
   {
     System.out.println("Invalid letter");
   }
   break;

case 6:
   System.out.println("substring");
   String stringName4="";
   int num_0=0;
   int num_4=0;
   System.out.println("Enter the String:");
   stringName4 = input.nextLine();
   try
   {
     System.out.println("Starting Number:");
     num_0=Integer.parseInt(input.nextLine());
     System.out.println("Ending Number:");
     num_4=Integer.parseInt(input.nextLine());
     if(num_0<=0 || num_4<=0)
     {
           System.out.println("Entered number is negative or Zero");
     }
     else
     {
     try
     {
       System.out.print(task.printingSubstring(stringName4,num_0-1,num_4));
     }
     catch(Exception inString)
     {
       System.out.println("Enter the valid input"+" "+inString.getMessage());
     }
     }
   }
   catch(Exception inNum)
   {
     System.out.println("Enter the valid Number.");
   }
   break;
                
case 7:
   System.out.println("Find First Three");
   int num_3=0;
   int num_5=0;
   String stringName5="";
   System.out.println("Enter the String:");
   stringName5 = input.nextLine();
   try
   {
     System.out.println("Starting Index Number");
     num_3=Integer.parseInt(input.nextLine());
     System.out.println("Ending Index Number");
     num_5=Integer.parseInt(input.nextLine());
     if(num_3<=0 || num_5<=0)
     {
           System.out.println("Entered number is negative or Zero");
     }
     else
     {
     try
     {
       System.out.println(task.findingSubstring(stringName5,num_3-1,num_5));
     }
     catch(Exception error3)
     {
       System.out.println("Enter valid input"+error3.getMessage());
     }
     }
   }
   catch(Exception error_1)
   {
     System.out.println("Enter valid number");
   }
   
   break;
                
case 8:
   System.out.println("replace");
   int num6=0;
   int num7=0;
   try
   {
     System.out.println("Starting position");
     num6 = Integer.parseInt(input.nextLine());
     System.out.println("Ending position");
     num7 = Integer.parseInt(input.nextLine());
     if(num6<=0 || num7<=0)
     {
           System.out.println("Entered number is negative or Zero");
     }
     else
     {
     System.out.println("Enter the Strings:");
     String stringName6 = input.nextLine();
     System.out.println("replacing letters:");
     String string6 = input.nextLine();
     try
     {
       System.out.println(task.replaceString(stringName6,string6,num6-1,num7));                       
     }
     catch(Exception error1)
     {
       System.out.println("Enter valid input."+error1.getMessage());
     }
   }
   }
   catch(Exception error_8)
   {
     System.out.println("Enter the correct number.");
   }
   break;

case 9:
   System.out.println("Checking");
   String stringName7="";
   String string7="";
   System.out.println("Enter the String:");
   stringName7 = input.nextLine();
   System.out.println("Enter the letters you have to check(From Front:");
   string7 = input.nextLine();
   try
   {
     System.out.println(task.checkingStrings(stringName7,string7));
   }
   catch(Exception error_9)
   {
     System.out.println("Enter the valid input."+error_9.getMessage());
   }
   break;

case 10:
   System.out.println("checking last");
   String stringName8="";
   String string8="";
   System.out.println("Enter the String:");
   stringName8 = input.nextLine();
   System.out.println("Enter the letters you have to check(From last):");
   string8 = input.nextLine();
   try
   {
     System.out.println(task.checkingStringsFromLast(stringName8,string8));
   }
   catch(Exception error_10)
   {
     System.out.println("Enter the valid input"+error_10.getMessage());
   }
   break;
                
case 11:
   System.out.println("Uppercase");
   String stringName9="";
   System.out.println("Enter the String:");
   stringName9 = input.nextLine();
   try
   {
     System.out.println(task.upperCase(stringName9));
   }
   catch(Exception error_11)
   {
     System.out.println("Enter the valid input"+error_11.getMessage());
   }
   break;

case 12:
   System.out.println("Lowercase");
   String stringName10="";
   System.out.println("Enter the String:");
   stringName10 = input.nextLine();
   try
   {
     System.out.print(task.lowerCase(stringName10));
   }
   catch(Exception error_12)
   {
     System.out.println("Enter the valid input"+error_12.getMessage());
   }
   break;

case 13:
   System.out.println("reverse");
   String stringName11="";
   System.out.println("Enter the String:");
   stringName11 = input.nextLine();
   try
   {
     System.out.print(task.reverse(stringName11));
   }
   catch(Exception error_13)
   {
     System.out.println("Enter the valid input"+error_13.getMessage());
   }
   break;
   
case 14:
   System.out.println("multiplestring");
   String strName1="";
   System.out.println("enter the String:");
   strName1=input.nextLine();
   try
   {
      System.out.println(task.multipleString(strName1));
   }
   catch(Exception error_14)
   {
      System.out.println("Enter the valid input"+error_14.getMessage());
   }
   break;

case 15:
   System.out.println("WithoutSpace");
   String name1="";
   String name2="";
   System.out.println("enter the String:");
   name1=input.nextLine();
   System.out.println("enter the String:");
   name2=input.nextLine();
   try
   {
     System.out.println(task.withoutSpace(name1,name2));
   }
   catch(Exception error_15)
   {
     System.out.println("Enter the valid input"+error_15.getMessage());
   }
   break;
                
case 16:
   System.out.println("Hyphenated Words");
   System.out.println("enter the Number:");
   try
   {
     int num4=Integer.parseInt(input.nextLine());
     String sentence[]=new String[num4];
     int i;
     for(i=0;i<num4;i++)
     {
       System.out.println("Enter the Strings:");
       sentence[i]=input.nextLine();
     }
     try
     {
        System.out.println(task.hyphenWords(sentence));
     }
     catch(Exception error_16)
     {
        System.out.println("enter the valid input"+error_16.getMessage());
     }
   }
   catch(Exception error)
   {
     System.out.println("enter the Number only");
   }
   break;
                
case 17:
   System.out.println("Equals");
   String stringName12="";
   String stringName13="";
   System.out.println("Enter the String:");
   stringName12 = input.nextLine();
   System.out.println("Enter the String:");
   stringName13 = input.nextLine();
   try
   {
      System.out.println(task.checkingStrings_1(stringName12, stringName13));
   }
   catch(Exception error_17)
   {
       System.out.println("Enter the valid input."+error_17.getMessage());
   }
   break;
                
case 18:
   System.out.println("EqualsIgnorecase");
   String stringName14="";
   String stringName15="";
   System.out.println("Enter the String:");
   stringName14 = input.nextLine();
   System.out.println("Enter the String:");
   stringName15 = input.nextLine();
   try
   {
      System.out.print(task.checkingStrings_2(stringName14,stringName15));
   }
   catch(Exception error_18)
   {
      System.out.println("Enter the valid input."+error_18.getMessage());
   }
   break;
                
case 19:
   System.out.println("Trim the spaces");
   String stringName16="";
   System.out.println("Enter the String:");
   stringName16 = input.nextLine();
   try
   {
      System.out.print(task.stringTrimming(stringName16));
   }
   catch(Exception error_19)
   {
      System.out.println("enter the valid input." + error_19.getMessage());
   }
   break;
                
case 20:
   System.out.println("split");
   String stringName17="";
   String[] stringArray={};
   System.out.println("Enter the Strings:");
   stringName17=input.nextLine();
   try
   {
     stringArray=task.stringSpliting(stringName17);
     for(String s:stringArray)
     {
       System.out.println(s);
     }
    }   
   catch(Exception stringError_20)
   {
      System.out.println("Enter the valid input"+stringError_20.getMessage());
   }
   break;
                
default:
     System.out.println("please enter the correct number");
     break;
}
}
catch(Exception e)
{
   System.out.println("enter number only");
}
}            
}
