package basicprogrammingtasks;
import java.io.*;
import java.lang.*;
import java.nio.charset.Charset;
import java.util.Properties;

import util.HelperUtil;
public class LogicalLayer{
	public LogicalLayer()
	{
		System.out.println("");
	}
	
	//method to create file.
	public File createFile(String path,String fileName)throws CustomException
	{
		HelperUtil.stringCheck(path);
		HelperUtil.stringCheck(fileName);
		File testFile=new File(path,fileName);
		try
		{
		if(!testFile.exists())
		{
			testFile.createNewFile();
		}
		return testFile;
		}
		catch(IOException e)
		{
			throw new CustomException(e);
		}
	}
	
	//method to create Directory
	public void createDirectory(String path,String dirName)throws CustomException
	{
		HelperUtil.stringCheck(path);
  	    HelperUtil.stringCheck(dirName);
		File newFile=new File(path+File.separator+dirName);
		if(newFile.mkdir())
		{
			System.out.println("Directory Created");
		}
		else
		{
			throw new CustomException("already Exists");
		}
	}
	
	//Method to create file with strings.
	public void createFile(String path,String fileName,boolean flag,String[] inputString)
    throws CustomException
	{
		HelperUtil.stringCheck(path);
  	    HelperUtil.stringCheck(fileName);
  	    File newFile=createFile(path,fileName);
		FileWriter newOne=null;
		try
		{
		newOne=new FileWriter(newFile,flag);
		HelperUtil.objectCheck(newOne);
		for(int i=0;i<inputString.length;i++)
		{
		newOne.append(inputString[i]+"\n");
		}
		}
		catch(IOException e)
		{
			throw new CustomException(e);
		}
		finally
		{
			try
			{
				newOne.close();
			}
			catch(Exception ex){}			
		}
	}

	
	//method to write in file using Properties.
    public Properties writeFileUsingProperties(String path,
    		String fileName,boolean flag,String key,String value,Properties properties)
    		throws CustomException
    {
        HelperUtil.objectCheck(properties);
        HelperUtil.stringCheck(key);
        HelperUtil.stringCheck(value);
    	HelperUtil.stringCheck(path);
  	    HelperUtil.stringCheck(fileName);
  	    File newFile=createFile(path,fileName);
    	FileWriter file=null;
    	BufferedWriter files=null;
    	try
    	{
    	  file=new FileWriter(newFile,flag);
    	  HelperUtil.objectCheck(file);
    	  files=new BufferedWriter(file);
    	  HelperUtil.objectCheck(files);
    	  properties.setProperty(key, value);
    	  properties.store(files,"Consists of 5 keys and values");
    	}
    	catch(IOException e)
    	{
    	    throw new CustomException(e);
    	}
    	finally
    	{
    		try 
    		{
    		files.close();
    		}
    		catch(Exception exp){}

    	}
		return properties;
    	
    }
    
    //method to read file context and print it in property object.
    public Properties readFileUsingProperties(String path,
    		String fileName,Properties myProp) throws CustomException
    {
    	HelperUtil.objectCheck(myProp);
    	HelperUtil.stringCheck(path);
  	    HelperUtil.stringCheck(fileName);
    	BufferedReader newReader1=null;
    	File newFile=new File(path+File.separator+fileName);
    	if(newFile.exists())
    	{
    		try(BufferedReader newReader11=new BufferedReader
    				(new FileReader(newFile)))
    		{
    		HelperUtil.objectCheck(newReader11);
        	myProp.load(newReader11);
    		return myProp;
    		}
    		catch(IOException e)
    		{
    			throw new CustomException(e);
    		}
    	}
        else
    		{
    		throw new CustomException("Doesn't Exist");
    		}
    	
    }
    
    //method to print object
    String name;
    public LogicalLayer(String name)
    {
    	this.name=name;
    }
    
	public String toString()
    {
		return ("Name:"+name); 	
    }
    
    
	}


