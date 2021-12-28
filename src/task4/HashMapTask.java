package task4;
import newexception.MistakeOccuredException;
import java.util.*;
public class HashMapTask
{ 
//method to check the map is null or not
public void mapCheck(Map<Object,Object> testHashMap)throws MistakeOccuredException
{
 if(testHashMap==null)
 {
  throw new MistakeOccuredException("Map should not be null");
 }
}

//method to create map.
public Map<Object,Object> createHashMap()throws MistakeOccuredException
{
 Map<Object,Object> newMap=new HashMap<>();
 return newMap;
}

//method to store key and values in map.
public Map<Object,Object> addInputsInHashMap(Map<Object,Object> testHashMap,Object key,Object value)throws MistakeOccuredException
{
  mapCheck(testHashMap);
  testHashMap.put(key,value);
  return testHashMap;  
}

//method to calculate size of map.
public int sizeOfHashMap(Map<Object,Object> testHashMap)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 int size=testHashMap.size();
 return size;
}

//method to store String key and String value in map.
public Map<Object,Object> hashMapWithInputs(Map<Object,Object> testHashMap,Object key,Object value)
throws MistakeOccuredException
{ 
 mapCheck(testHashMap);
 testHashMap.put(key,value);
 return testHashMap;
}

//method to check key is present in map or not.
public boolean checkKey(Map<Object,Object> testHashMap,Object key)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 boolean condition=testHashMap.containsKey(key);
 return condition;
}

//method to check value is present in map or not.
public boolean checkValue(Map<Object,Object> testHashMap,Object value)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 boolean condition=testHashMap.containsValue(value);
 return condition;
}

//method to replace Old value to new value.
public Map<Object,Object> replaceAllValueswithSameKeys(Map<Object,Object> testHashMap,Object key,Object value)throws MistakeOccuredException
{
  mapCheck(testHashMap);
  testHashMap.replace(key,value);
  return testHashMap;  
}

//method to get value at key.
public Object getValueOfKey(Map<Object,Object> testHashMap,Object key)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 Object output=testHashMap.get(key);
 return output;
}

//method to get value of nonExisting key.
public Object getValueOfNonExistingKey(Map<Object,Object> testHashMap,Object key,Object defaultValue)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 Object output=testHashMap.getOrDefault(key,defaultValue);
 return output;
} 

//method to return given one for non Existing key
public Map<Object,Object> returnValueForNonExistingKey(Map<Object,Object> testHashMap,Object key,Object value)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 testHashMap.putIfAbsent(key,value);
 return testHashMap;
}

//method to remove a key from map.
public Map<Object,Object> removeKey(Map<Object,Object> testHashMap,Object key)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 testHashMap.remove(key);
 return testHashMap;
}

//method to remove key when it has its value.
public Map<Object,Object> removeKey(Map<Object,Object> testHashMap,Object key,Object value)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 testHashMap.remove(key,value);
 return testHashMap;
}

//method to replace value of existing key
public Map<Object,Object> replaceValue(Map<Object,Object> testHashMap,Object key,Object value)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 testHashMap.replace(key,value);
 return testHashMap;
}

//method to replace value of existing key with same value.
public Map<Object,Object> replaceValue(Map<Object,Object> testHashMap,Object key,Object oldValue,Object newValue)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 testHashMap.replace(key,oldValue,newValue);
 return testHashMap;
}

//method to transfer pair of keys and values of one hashMap to another hashmap.
public Map<Object,Object> transferPairs(Map<Object,Object> testHashMap1,Map<Object,Object> testHashMap2)throws MistakeOccuredException
{
 mapCheck(testHashMap1);
 mapCheck(testHashMap2);
 testHashMap1.putAll(testHashMap2);
 return testHashMap1;
}

//method to iterate hashmap
public Iterator hashMapIteration(Map<Object,Object> testHashMap)throws MistakeOccuredException
{
 mapCheck(testHashMap);
 Iterator newIterator=testHashMap.entrySet().iterator();
 return newIterator;
}

//method to remove all entries in a hashMap.
public Map<Object,Object> clearHashMap(Map<Object,Object> testHashMap)throws MistakeOccuredException
{
  mapCheck(testHashMap);
  testHashMap.clear();
  return testHashMap;
} 

}

 
