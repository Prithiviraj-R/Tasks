package com.basicprogramming.inheritance;
import java.util.*;

public class RunnerClass 
{
// method for question 4.
public static void qualityDetails(Car newCar)
{   
	if(newCar instanceof Swift)
	{
		System.out.println("Hatch");
	}
	else if(newCar instanceof Xuv)
	{
		System.out.println("SUV");
	}
	else if(newCar instanceof SCross)
	{
		System.out.println("Sedan");
	}
	else
	{
	System.out.println("Our company Cars are Super.");
	}
}
//method for question 6.
public static void particularDetail(Swift mySwift)
{
	System.out.println("Swift has two models");
}
public static void main(String[] args)
{
	try
	{
	Scanner input=new Scanner(System.in);
	int choice=input.nextInt();
	input.nextLine();
	switch(choice)
	{
	
	case 1:
	try
	{
		Swift myObj=new Swift();
		System.out.println("Enter the colour:");
		String colour=input.nextLine();
		myObj.setColour(colour);
		System.out.println("enter the model:");
		String model=input.nextLine();
		myObj.setModel(model);
		System.out.println("Enter the number of seats:");
		int seats=input.nextInt();input.nextLine();
		myObj.setSeats(seats);
		System.out.println("Enter the Number of airbags:");
		int airBags=input.nextInt();input.nextLine();
		myObj.setAirBags(airBags);
		System.out.println(myObj.getColour());
		System.out.println(myObj.getModel());
		System.out.println(myObj.getSeats());
		System.out.println(myObj.getAirBags());
	}
	catch(Exception ex)
	{
		System.out.println("Enter the valid input.");
	}
	break;
	
	case 2:
		try
		{
		SCross myObj1=new SCross();
		System.out.println("Enter the colour:");
		String colour1=input.nextLine();
		myObj1.setColour(colour1);
		System.out.println("enter the model:");
		String model1=input.nextLine();
		myObj1.setModel(model1);
		System.out.println("Enter the number of seats:");
		int seats1=input.nextInt();input.nextLine();
		myObj1.setSeats(seats1);
		System.out.println("Enter the number of airbags:");
		int airBags1=input.nextInt();input.nextLine();
		myObj1.setAirBags(airBags1);
		System.out.println("Enter the year of make:");
		int yearOfMake=input.nextInt();input.nextLine();
		myObj1.setYearOfMake(yearOfMake);
		System.out.println("Enter the engine number:");
		String engineNumber=input.nextLine();
		myObj1.setEngineNumber(engineNumber);
		System.out.println("Enter the type:");
		String type=input.nextLine();
		myObj1.setType(type);
		System.out.println(myObj1.getColour());
		System.out.println(myObj1.getModel());
		System.out.println(myObj1.getSeats());
		System.out.println(myObj1.getAirBags());
		System.out.println(myObj1.getYearOfMake());
		System.out.println(myObj1.getEngineNumber());
		System.out.println(myObj1.getType());
		}
		catch(Exception ex)
		{
			System.out.println("Enter the valid input.");
		}
	break;
	
	case 3:
		Swift myObj2=new Swift();
		qualityDetails(myObj2);
	break;
	
	case 4:
		Swift myObj3=new Swift();
		qualityDetails(myObj3);
		SCross newOne=new SCross();
		qualityDetails(newOne);
		Xuv newOne1=new Xuv();
		qualityDetails(newOne1);
		break;	
		
	case 5:
		Swift mySwift=new Swift();
		particularDetail(mySwift);
		Car obj=new Car();
		//particularDetail(obj);
		SCross myScross=new SCross();
		//particularDetail(myScross);
		Xuv myXuv0=new Xuv();
		//particularDetail(myXuv0);
	break;
		
	case 6:
		SCross newScross=new SCross();
		newScross.maintenance();
		Car obj1=new SCross();
		obj1.maintenance();
		Car newCar=new Car();
		newCar.maintenance();
		Swift mySwift1=new Swift();
		mySwift1.maintenance();
	break;
	
	case 7:
		Xuv myXuv=new Xuv();
		//Xuv myXuv1=new Xuv("Hi welcome");
		
	case 8:
		//BirdAbstract myObj4=new BirdAbstract();
		ParrotMod objForParrotMod=new ParrotMod();
		objForParrotMod.fly();
		objForParrotMod.speak();
	break;
	
	case 9:
		Duck myDuck=new Duck();
		myDuck.fly();
		myDuck.speak();
	break;
	
	default:
	    System.out.println("Enter the correct number.");	
		
}
	}
catch(Exception exception)
{
	System.out.println("Enter the number only.");
}
}
}
