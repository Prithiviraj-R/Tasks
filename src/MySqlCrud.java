package com.database;
import java.sql.*;
import basicprogrammingtasks.CustomException;
import util.HelperUtil;
public class MySqlCrud
{
//create table	
public void createTable(String url,String userName,String passWord,String query)throws CustomException
{
	HelperUtil.stringCheck(url);
	HelperUtil.stringCheck(userName);
	HelperUtil.stringCheck(passWord);
	HelperUtil.stringCheck(query);
	try(Connection con=DriverManager.getConnection(url,userName,passWord);
			Statement stmt=con.createStatement();)
	{
	if(stmt.execute(query))
	{
		System.out.println("Table created");
	}
	else
	{
		System.out.println("Table already exists");
	}
	}
	catch(SQLException e)
	{
		throw new CustomException(e);
	}
}

//insert table
public void insertTable(String url,String userName,String passWord,String tableName,String query)throws CustomException
{
	HelperUtil.stringCheck(url);
	HelperUtil.stringCheck(userName);
	HelperUtil.stringCheck(passWord);
	HelperUtil.stringCheck(query);
	Connection con=null;
	Statement stmt=null;
	try
	{
	con=DriverManager.getConnection(url,userName,passWord);
	stmt=con.createStatement();
	int affected=stmt.executeUpdate(query);
	System.out.println(affected+"row/s affected");
	} 
	catch (SQLException e)
	{
		throw new CustomException(e);
	}
	finally
	{
		try 
		{
			stmt.close();
		    con.close();
		}
		catch (SQLException e){}
	}
}

//delete record
public void deleteTable(String url,String userName,String passWord,String query)throws CustomException
{
	HelperUtil.stringCheck(url);
	HelperUtil.stringCheck(userName);
	HelperUtil.stringCheck(passWord);
	HelperUtil.stringCheck(query);
	try(Connection con=DriverManager.getConnection(url,userName,passWord);
			Statement stmt=con.createStatement();)
	{
	int affected=stmt.executeUpdate(query);
	System.out.println(affected+" row/s affected.");
	}
	catch(SQLException e)
	{
		throw new CustomException(e);
	}
}

//insert record
public void insertRecord(String url,String userName,String passWord,String query)throws CustomException
{
	HelperUtil.stringCheck(url);
	HelperUtil.stringCheck(userName);
	HelperUtil.stringCheck(passWord);
	HelperUtil.stringCheck(query);
	try(Connection con=DriverManager.getConnection(url,userName,passWord);
			Statement stmt=con.createStatement();)
	{
	int affected=stmt.executeUpdate(query);
	System.out.println(affected+" row/s affected.");
	}
	catch(SQLException e)
	{
		throw new CustomException(e);
	}	
}

//select record
public void selectRecord(String url,String userName,String passWord,String query)throws CustomException
{
	HelperUtil.stringCheck(url);
	HelperUtil.stringCheck(userName);
	HelperUtil.stringCheck(passWord);
	HelperUtil.stringCheck(query);
	try(Connection con=DriverManager.getConnection(url,userName,passWord);
			Statement stmt=con.createStatement();)
	{
	   ResultSet resSet=stmt.executeQuery(query);
	   while(resSet.next())
	   {
		   System.out.println("Student Id:"+resSet.getInt(0)+"Student Name:"+resSet.getString(1));
	   }
	}
	catch(SQLException e)
	{
		throw new CustomException(e);
	}	
}

}
