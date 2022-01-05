package com.basicprogramming.threads;

import java.util.Scanner;

public class RunnerClass
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	int choice=Integer.parseInt(input.nextLine());
	switch(choice)
	{
	
	case 1:
		
	    ExtendedThread thread=new ExtendedThread();
	    System.out.println("before Starting");
	    System.out.println("Current thread name before Starting:"+thread.currentThread().getName());
		System.out.println("Current thread priority before Starting:"+thread.currentThread().getPriority());
		System.out.println("Current thread state before Starting:"+thread.currentThread().getState());
	    System.out.println("After Starting");
		thread.start();
     break;
     
	case 2:
		RunnableThread newThread=new RunnableThread();
		Thread thread1=new Thread(newThread);
		System.out.println("before Starting");
		System.out.println("Current Thread Name before Starting:"+Thread.currentThread().getName());
		System.out.println("Current Thread Priority before Starting:"+Thread.currentThread().getPriority());
		System.out.println("Current Thread State before Starting:"+Thread.currentThread().getState());
		System.out.println("After Starting");
		thread1.start();
		break;
    
	case 3:
		ExtendedThread thread2=new ExtendedThread();
		RunnableThread newThread1=new RunnableThread();
		Thread thread3=new Thread(newThread1);
		thread2.setName("hi");
	    System.out.println("Current thread name before Starting:"+thread2.currentThread().getName());
		System.out.println("Current thread priority before Starting:"+thread2.currentThread().getPriority());
		System.out.println("Current thread state before Starting:"+thread2.currentThread().getState());
	    System.out.println(" ");
		thread2.start();
		System.out.println("Current Thread Name before Starting1:"+Thread.currentThread().getName());
		System.out.println("Current Thread Priority before Starting1:"+Thread.currentThread().getPriority());
		System.out.println("Current Thread State before Starting1:"+Thread.currentThread().getState());
		System.out.println(" ");
		thread3.start();
		break;
		
	case 4:
		
    default:
    	System.out.println("Enter the correct number.");
	}
}
}
