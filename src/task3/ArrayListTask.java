package task3;
import task1.StringTask;
import java.util.*;
public class ArrayListTask
{
StringTask task1=new StringTask();

//method used to check list.
public void arrayListCheck(List testArrayList)throws Exception
{
   if(testArrayList==null)
   {
    throw new Exception("ArrayList cannot be null.");
   }
}   

//method to check the input numbers.
public void numberCheck(int testNumber,List testArrayList)throws Exception
{
  if(testNumber<0 || arrayListSize(testArrayList)<testNumber)
  {
    throw new Exception("Number is negative or number exceeds length");
  }
}

//method used to create list.
public List createEmptyArrayList()
{
   List testList=new ArrayList();
   return testList;
}

//method used to calculate size of list.
public int arrayListSize(List testArrayList)throws Exception
{
   arrayListCheck(testArrayList);
   int length=testArrayList.size();
   return length;
}

//method used to add object in list.
public List arrayListWithObject(List testArrayList,Object[] objectArray)throws Exception
{
   arrayListCheck(testArrayList);
   testArrayList.addAll(Arrays.asList(objectArray));
   return testArrayList;
}

//method to solve 6th question & method used to find first occurance.
public int findIndexNumber(List testArrayList,String testString)throws Exception
{
   arrayListCheck(testArrayList);
   int indexNumber=testArrayList.indexOf(testString);
   return indexNumber;
}

//method to solve 7th question.
public Iterator printElementUsingIterator(List testArrayList)throws Exception
{
   arrayListCheck(testArrayList);
   Iterator newList=testArrayList.iterator();
   return newList;
}

//method to solve 8th question.
public Object findElementAtGivenIndex(List testArrayList,int position)throws Exception
{
   arrayListCheck(testArrayList);
   numberCheck(position,testArrayList);
   Object stringAtPosition=testArrayList.get(position);
   return stringAtPosition;  
}

//method to find last Occurance.
public int findLastIndexNumber(List testArrayList,String testString)throws Exception
{
   arrayListCheck(testArrayList);
   int lastIndexNumber=testArrayList.lastIndexOf(testString);
   return lastIndexNumber;
}

//method to add elements at specific position.
public List addNewElement(List testArrayList,int position,String newString)throws Exception
{
    arrayListCheck(testArrayList);
    numberCheck(position,testArrayList);
    testArrayList.add(position,newString);
    return testArrayList;
}

//method used to create sublist & used in 11th problem
public List createSubList(List testArrayList1,
int startPosition,int endPosition)throws Exception
{
     arrayListCheck(testArrayList1);
     task1.indexCheck(startPosition,endPosition);
     numberCheck(startPosition,testArrayList1);
     numberCheck(endPosition,testArrayList1);
     List newList=testArrayList1.subList(startPosition,endPosition);
     return newList;
}

//method to solve 12th problem.
public List addTwoArrayList(List testArrayList1,List testArrayList2)throws Exception
{
     arrayListCheck(testArrayList1);
     arrayListCheck(testArrayList2);
     testArrayList1.addAll(testArrayList2);
     return testArrayList1;
}

//method to solve 14th problem.
public List removeElementsFromList(List testArrayList,float numberToRemove)throws Exception
{
     arrayListCheck(testArrayList);
     testArrayList.remove(numberToRemove);
     return testArrayList;
}

//method to solve 15th problem.
public List removeElementsFromList(List testArrayList,int position)throws Exception
{
     arrayListCheck(testArrayList);
     numberCheck(position,testArrayList);
     testArrayList.remove(position);
     return testArrayList;
}

//method to solve 17th problem.
public List removeSameElements(List testArrayList1,List testArrayList2)throws Exception
{
     arrayListCheck(testArrayList1);
     arrayListCheck(testArrayList2);
     testArrayList1.removeAll(testArrayList2);
     return testArrayList1;
}

//method to solve 18th problem.
public List retainSameElements(List testArrayList1,List testArrayList2)throws Exception
{
     arrayListCheck(testArrayList1);
     arrayListCheck(testArrayList2);
     testArrayList1.retainAll(testArrayList2);
     return testArrayList1;
}

//method to solve 19th problem.
public List clearList(List testArrayList)throws Exception
{
     arrayListCheck(testArrayList);
     testArrayList.clear();
     return testArrayList;
}

//method to solve 20th problem.
public boolean checkStrings(List testArrayList,String stringToCheck)throws Exception
{
     arrayListCheck(testArrayList);
     boolean condition=testArrayList.contains(stringToCheck);
     return condition;
}

}
