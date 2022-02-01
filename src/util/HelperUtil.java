package util;
import newexception.MistakeOccuredException;
public class HelperUtil
{
public static void indexCheck(int startingNumber,int endingNumber)throws MistakeOccuredException
{
    if(startingNumber>endingNumber)
    {
       throw new MistakeOccuredException("Starting number should not exceed Ending Number");
    }
}

public static void stringCheck(String testString)throws MistakeOccuredException
{
    if(testString==null || testString.isEmpty())
    {
      throw new MistakeOccuredException("String cannot be null or Empty");
    }
}

public static void objectCheck(Object objectName)throws MistakeOccuredException
{
    if(objectName==null)
    {
        throw new MistakeOccuredException("Object Should not be null");
    }
}

public static void checkingStringArray(String[] stringArray)throws MistakeOccuredException
{
    for(String words:stringArray)
    {
      stringCheck(words);
    } 
}
}
