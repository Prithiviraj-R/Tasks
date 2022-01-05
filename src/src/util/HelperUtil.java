package util;
import basicprogrammingtasks.CustomException;
public class HelperUtil
{
public static void indexCheck(int startingNumber,int endingNumber)throws CustomException
{
    if(startingNumber>endingNumber)
    {
       throw new CustomException("Starting number should not exceed Ending Number");
    }
}

public static void stringCheck(String testString)throws CustomException
{
    if(testString==null || testString.isEmpty())
    {
      throw new CustomException("String cannot be null or Empty");
    }
}

public static void objectCheck(Object objectName)throws CustomException
{
    if(objectName==null)
    {
        throw new CustomException("Object Should not be null");
    }
}

public static void checkingStringArray(String[] stringArray)throws CustomException
{
    for(String words:stringArray)
    {
      stringCheck(words);
    } 
}
}
