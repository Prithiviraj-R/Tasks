package task1;
import newexception.MistakeOccuredException;
import util.HelperUtil;
public class StringTask{

public int getLength(String inputString)throws MistakeOccuredException
{

   HelperUtil.stringCheck(inputString);             
   int stringLength=inputString.length();
   return stringLength;
}


public char[] characterArray(String inputString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString);
   char chararray[]= inputString.toCharArray();
   return chararray;
}


public char findLetter(String inputString,int indexNumber)throws MistakeOccuredException 
{
   HelperUtil.stringCheck(inputString);
   numberCheck(indexNumber,inputString);
   int intial1=getLength(inputString);   
   char charOfIndex = inputString.charAt(indexNumber);
   return charOfIndex;
}


public int countingLetters(String inputString,char letterToFind)throws MistakeOccuredException
{
   int count = 0;
   HelperUtil.stringCheck(inputString);
   for (int i = 0; i < inputString.length(); i++) 
   {
     if (letterToFind == inputString.charAt(i))
     {
      count++;
     }
    }
    return count;
}


public int highestOccurances(String inputString,char inputLetter)throws MistakeOccuredException
{
   
   HelperUtil.stringCheck(inputString);
   int number = inputString.lastIndexOf(inputLetter);
   return number;
}


public String printingSubstring(String inputString,int startingPosition,int endingPosition)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString);
   HelperUtil.indexCheck(startingPosition,endingPosition);
   numberCheck(startingPosition,inputString);
   numberCheck(endingPosition,inputString);
   String outputString = inputString.substring(startingPosition,endingPosition);
   return outputString;
}


public String findingSubstring(String inputString,int startingPosition,int endingPosition) throws MistakeOccuredException
{
    HelperUtil.indexCheck(startingPosition,endingPosition);
    String outputString=printingSubstring(inputString,startingPosition,endingPosition);
    return outputString;
}


public String replaceString(String actualString,String replacingString,int startingPosition,int endingPosition)throws MistakeOccuredException
{
   HelperUtil.stringCheck(actualString);
   HelperUtil.stringCheck(replacingString);
   HelperUtil.indexCheck(startingPosition,endingPosition);
   numberCheck(startingPosition,actualString);
   numberCheck(endingPosition,actualString);
   String tempString_1 = actualString.substring(startingPosition, endingPosition);
   String replacedString= actualString.replace(tempString_1,replacingString);
   return replacedString;
}

public boolean checkingStrings(String actualString,String testString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(actualString);
   HelperUtil.stringCheck(testString);
   boolean checkedString = actualString.startsWith(testString);
   return checkedString;
}

public boolean checkingStringsFromLast(String actualString,String testString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(actualString);
   HelperUtil.stringCheck(testString);
   boolean checkedString = actualString.endsWith(testString);
   return checkedString;
}

public String upperCase(String inputString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString);
   String outputString = inputString.toUpperCase();
   return outputString;
}

public String lowerCase(String inputString)throws MistakeOccuredException
{
    HelperUtil.stringCheck(inputString);
    String outputString = inputString.toLowerCase();
    return outputString;
}

public String reverse(String inputString)throws MistakeOccuredException
{
  String reversedString="";
  HelperUtil.stringCheck(inputString);   
  char[] charArray = characterArray(inputString);
  System.out.println(charArray);
  for (int i = inputString.length() - 1; i >= 0; i--)
  {
    reversedString = reversedString + charArray[i];
  }
  return reversedString;
}

public String multipleString(String inputString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString);         
   return inputString;
}
        
public String withoutSpace(String inputString1,String inputString2)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString1);
   HelperUtil.stringCheck(inputString2);
   String name3=inputString1.concat(inputString2);
   String replacedString = name3.replaceAll("\\s", "");
   return replacedString;
}

public String hyphenWords(String []stringArray)throws MistakeOccuredException
{
   HelperUtil.checkingStringArray(stringArray);
   String mergedString = String.join("-",stringArray);
   return mergedString;
}
        
public boolean checkingStrings_1(String testString_1,String testString_2)throws MistakeOccuredException
{
    HelperUtil.stringCheck(testString_1);
    HelperUtil.stringCheck(testString_2);    
    boolean checkedString=testString_1.equals(testString_2);
    return checkedString;
}
        
public boolean checkingStrings_2(String testString_1,String testString_2)throws MistakeOccuredException
{
    HelperUtil.stringCheck(testString_1);
    HelperUtil.stringCheck(testString_2);
    boolean checkedString= testString_1.equalsIgnoreCase(testString_2);
    return checkedString;
}
        

public String stringTrimming(String inputString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString);
   return(inputString.trim());
}
        

public String[] stringSpliting(String inputString)throws MistakeOccuredException
{
   HelperUtil.stringCheck(inputString);
   String[] outputString=inputString.split("\\s");
   return outputString;
}


public void numberCheck(int testNumber,String testString)throws MistakeOccuredException
{
    numberCheck(testNumber,getLength(testString));
}

public void numberCheck(int testNumber,int stringLength)throws MistakeOccuredException
{
    if(testNumber<0||stringLength<=testNumber)
    {
      throw new MistakeOccuredException("Number cannot be negative or Given number exceeds the length of the Given string");
    }
}

}
