package com.basicprogramming.inheritance;

public class test
{

private String name;
private int age;
public test()
{
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public test(String n, int a)
{
    this.name=n;
    this.age=a;
}

}
class man extends test {
	private String h;
	private int b;
	public man()
	{
		
	}

	public String getH() {
		return h;
	}

	public void setH(String h) {
		this.h = h;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public man(String h, int b) {
		super("hi",4);
		this.h=h;
		this.b=b;
	}
	public static void main(String[] args)
	{
		man obj=new man();
		obj.setH("hi");
		obj.setB(9);
		System.out.println(obj.getB());
		}

}
