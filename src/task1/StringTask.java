package task1;

public class StringTask{

public int getLength(String inputString)throws Exception
{

   stringCheck(inputString);             
   int stringLength=inputString.length();
   return stringLength;
}


public char[] characterArray(String inputString)throws Exception
{
   stringCheck(inputString);
   char chararray[]= inputString.toCharArray();
   return chararray;
}


public char findLetter(String inputString,int indexNumber)throws Exception 
{
   stringCheck(inputString);
   numberCheck(indexNumber,inputString);
   int intial1=getLength(inputString);   
   char charOfIndex = inputString.charAt(indexNumber);
   return charOfIndex;
}


public int countingLetters(String inputString,char letterToFind)throws Exception
{
   int count = 0;
   stringCheck(inputString);
   for (int i = 0; i < inputString.length(); i++) 
   {
     if (letterToFind == inputString.charAt(i))
     {
      count++;
     }
    }
    return count;
}


public int highestOccurances(String inputString,char inputLetter)throws Exception
{
   
   stringCheck(inputString);
   int number = inputString.lastIndexOf(inputLetter);
   return number;
}


public String printingSubstring(String inputString,int startingPosition,int endingPosition)throws Exception
{
   stringCheck(inputString);
   indexCheck(startingPosition,endingPosition);
   numberCheck(startingPosition,inputString);
   numberCheck(endingPosition,inputString);
   String outputString = inputString.substring(startingPosition,endingPosition);
   return outputString;
}


public String findingSubstring(String inputString,int startingPosition,int endingPosition) throws Exception
{
    indexCheck(startingPosition,endingPosition);
    String outputString=printingSubstring(inputString,startingPosition,endingPosition);
    return outputString;
}


public String replaceString(String actualString,String replacingString,int startingPosition,int endingPosition)throws Exception
{
   stringCheck(actualString);
   stringCheck(replacingString);
   indexCheck(startingPosition,endingPosition);
   numberCheck(startingPosition,actualString);
   numberCheck(endingPosition,actualString);
   String tempString_1 = actualString.substring(startingPosition, endingPosition);
   String replacedString= actualString.replace(tempString_1,replacingString);
   return replacedString;
}

public boolean checkingStrings(String actualString,String testString)throws Exception
{
   stringCheck(actualString);
   stringCheck(testString);
   boolean checkedString = actualString.startsWith(testString);
   return checkedString;
}

public boolean checkingStringsFromLast(String actualString,String testString)throws Exception
{
   stringCheck(actualString);
   stringCheck(testString);
   boolean checkedString = actualString.endsWith(testString);
   return checkedString;
}

public String upperCase(String inputString)throws Exception
{
   stringCheck(inputString);
   String outputString = inputString.toUpperCase();
   return outputString;
}

public String lowerCase(String inputString)throws Exception
{
    stringCheck(inputString);
    String outputString = inputString.toLowerCase();
    return outputString;
}

public String reverse(String inputString)throws Exception
{
  String reversedString="";
  stringCheck(inputString);   
  char[] charArray = characterArray(inputString);
  System.out.println(charArray);
  for (int i = inputString.length() - 1; i >= 0; i--)
  {
    reversedString = reversedString + charArray[i];
  }
  return reversedString;
}

public String multipleString(String inputString)throws Exception
{
   stringCheck(inputString);         
   return inputString;
}
        
public String withoutSpace(String inputString1,String inputString2)throws Exception
{
   stringCheck(inputString1);
   stringCheck(inputString2);
   String name3=inputString1.concat(inputString2);
   String replacedString = name3.replaceAll("\\s", "");
   return replacedString;
}

public String hyphenWords(String []stringArray)throws Exception
{
   checkingStringArray(stringArray);
   String mergedString = String.join("-",stringArray);
   return mergedString;
}
        
public void checkingStringArray(String[] stringArray)throws Exception
{
    for(String words:stringArray)
    {
      stringCheck(words);
    } 
}
        
public boolean checkingStrings_1(String testString_1,String testString_2)throws Exception
{
    stringCheck(testString_1);
    stringCheck(testString_2);    
    boolean checkedString=testString_1.equals(testString_2);
    return checkedString;
}
        
public boolean checkingStrings_2(String testString_1,String testString_2)throws Exception
{
    stringCheck(testString_1);
    stringCheck(testString_2);
    boolean checkedString= testString_1.equalsIgnoreCase(testString_2);
    return checkedString;
}
        

public String stringTrimming(String inputString)throws Exception
{
   stringCheck(inputString);
   return(inputString.trim());
}
        

public String[] stringSpliting(String inputString)throws Exception
{
   stringCheck(inputString);
   String[] outputString=inputString.split("\\s");
   return outputString;
}

public void stringCheck(String testString)throws Exception
{
    if(testString==null || testString.isEmpty())
    {
      throw new Exception("String cannot be null or Empty");
    }
}

private void numberCheck(int testNumber,String testString)throws Exception
{
    if(testNumber<0||testString.length()<=testNumber)
    {
      throw new Exception("Number cannot be negative or Given number exceeds the length of the Given string");
    }
}
private void indexCheck(int startingNumber,int endingNumber)throws Exception
{
    if(startingNumber>endingNumber)
    {
       throw new Exception("Starting number should not exceed Ending Number");
    }
}

}
