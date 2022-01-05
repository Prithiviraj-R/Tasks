package com.basicprogramming.inheritance;

public class SCross extends Car
{
	private int seats;
    private int airbags;
    private String model;
    private String colour;
    public int getSeats()
    {
    	return seats; 
    }
    public void setSeats(int seats)
    {
    	this.seats=seats;
    }
    public void setAirBags(int airBags)
    {
    	this.airbags=airBags;
    }
    public int getAirBags()
    {
    	return airbags;
    }
    public void setModel(String model)
    {
    	this.model=model;
    }
    public String getModel()
    {
    	return model;
    }
    public void setColour(String colour)
    {
    	this.colour=colour;
    }
    public String getColour()
    {
    	return colour;
    }
    public void maintenance()
    {
    	System.out.println("maruti SCross is maintenance.");
    }
    
}
