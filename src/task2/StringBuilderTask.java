package task2;
import task1.StringTask;
import newexception.MistakeOccuredException;
import util.HelperUtil;
public class StringBuilderTask{
StringTask task1=new StringTask();

//method used to create a empty stringbuilder.
public StringBuilder createStringBuilder()throws Exception
{
    StringBuilder newStringBuilder=new StringBuilder();
    return newStringBuilder;
}

//method used to create a stringbuilder with single input.
public StringBuilder createStringBuilderWithInput(String inputString)throws Exception
{
    HelperUtil.stringCheck(inputString);
    StringBuilder stringBuilder=new StringBuilder(inputString);
    return stringBuilder;
}


//method used to append the string.
public StringBuilder appendedString(StringBuilder testStringBuilder,String inputString)
throws Exception
{   
    HelperUtil.objectCheck(testStringBuilder);
    testStringBuilder.append(inputString);
    return testStringBuilder;
}

//method used to calculate the length of the stringbuilder.
public int lengthOfStringBuilder(StringBuilder testStringBuilder)throws Exception
{
   HelperUtil.objectCheck(testStringBuilder);
   int length=testStringBuilder.length();
   return length;
}

//method used to solve 2nd problem.
public StringBuilder insertSymbol(StringBuilder testStringBuilder,
String[] stringArray,String symbol)throws Exception
{  
   HelperUtil.objectCheck(testStringBuilder);
   HelperUtil.objectCheck(symbol);
   HelperUtil.checkingStringArray(stringArray);//method used to check the stringArray.
   for(int i=0;i<stringArray.length;i++)
   {
      testStringBuilder.append(symbol);
      testStringBuilder.append(stringArray[i]);
   }
   return testStringBuilder;
}

//method used to solve 3rd problem.
public StringBuilder insertString(StringBuilder testStringBuilder,
String inputString,String insertingString,String symbol)throws Exception
{  
   HelperUtil.objectCheck(testStringBuilder);
   HelperUtil.stringCheck(insertingString);//method used to check the string.
   int position=task1.getLength(inputString);//method used to calculate the stringlength.
   testStringBuilder.insert(position+1,insertingString);
   testStringBuilder.insert(position+task1.getLength(insertingString)+1,symbol);
   return testStringBuilder;
}

//method used to solve 4th problem.
public StringBuilder deleteString(String inputString,StringBuilder testStringBuilder)
throws Exception
{  
   HelperUtil.objectCheck(testStringBuilder);
   HelperUtil.stringCheck(inputString);//method used to check the string
   int position=task1.getLength(inputString);//method used to calculate stringLength.
   testStringBuilder.delete(0,position+1);
   return testStringBuilder;
}

//method used to solve 5th problem.
public StringBuilder replaceSpace(StringBuilder testStringBuilder,char insertingSymbol,char symbol)
throws Exception
{  
   HelperUtil.objectCheck(testStringBuilder);
   for(int i=0;i<testStringBuilder.length();i++)
   {
     if(testStringBuilder.charAt(i)==insertingSymbol)
     {
       testStringBuilder.setCharAt(i,symbol);
     } 
   } 
   return testStringBuilder;
}

//method used to solve 6th problem.
public StringBuilder reverseString(StringBuilder testStringBuilder)throws Exception
{
   HelperUtil.objectCheck(testStringBuilder);
   testStringBuilder.reverse();
   return testStringBuilder;
}

//method used to solve 7th problem.
public StringBuilder deleteCharacters(StringBuilder testStringBuilder,
int startingPosition,int endingPosition)throws Exception
{  
   HelperUtil.objectCheck(testStringBuilder);
   int lengthOfTestStringBuilder=lengthOfStringBuilder(testStringBuilder);
   task1.numberCheck(startingPosition,lengthOfTestStringBuilder);//method used to check the position and length of the string.
   task1.numberCheck(endingPosition,lengthOfTestStringBuilder);
   HelperUtil.indexCheck(startingPosition,endingPosition);
   testStringBuilder.delete(startingPosition,endingPosition);
   return testStringBuilder;
}

//method used to solve 8th problem.
public StringBuilder replaceCharacters(StringBuilder testStringBuilder,String replacingString,
int startingPosition,int endingPosition)throws Exception
{
   HelperUtil.objectCheck(testStringBuilder);
   HelperUtil.stringCheck(replacingString);
   int lengthOfTestStringBuilder=lengthOfStringBuilder(testStringBuilder);
   task1.numberCheck(startingPosition,lengthOfTestStringBuilder);//method used to check the position and length of the String.
   task1.numberCheck(endingPosition,lengthOfTestStringBuilder);
   HelperUtil.indexCheck(startingPosition,endingPosition);//method used to check two positions.
   testStringBuilder.replace(startingPosition,endingPosition,replacingString);
   return testStringBuilder;
}

//method used to solve 9th problem.
public  int indexOfString(StringBuilder testStringBuilder,String findingElement)throws Exception
{
   HelperUtil.objectCheck(testStringBuilder);
   HelperUtil.stringCheck(findingElement);
   int indexNumber=testStringBuilder.indexOf(findingElement);
   return indexNumber;
}

//method used to solve 10th problem.
public int lastIndexOfString(StringBuilder testStringBuilder,String findingElement)throws Exception
{
   HelperUtil.objectCheck(testStringBuilder);
   HelperUtil.stringCheck(findingElement);
   int lastOccurancesIndexNumber=testStringBuilder.lastIndexOf(findingElement);
   return lastOccurancesIndexNumber;
}

}


