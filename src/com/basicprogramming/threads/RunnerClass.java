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
		System.out.println("Current Thread Name before Starting:"+thread1.currentThread().getName());
		System.out.println("Current Thread Priority before Starting:"+thread1.currentThread().getPriority());
		System.out.println("Current Thread State before Starting:"+thread1.currentThread().getState());
		System.out.println("After Starting");
		thread1.start();
		System.out.println("Current Thread Name before Starting:"+thread1.currentThread().getName());
		System.out.println("Current Thread Priority before Starting:"+thread1.currentThread().getPriority());
		System.out.println("Current Thread State before Starting:"+thread1.currentThread().getState());
		break;
    
	case 3:
		ExtendedThread thread2=new ExtendedThread();
		RunnableThread newThread1=new RunnableThread();
		Thread thread3=new Thread(newThread1);
		thread2.setName("ExtendedThread");
	    System.out.println("Current thread name before Starting:"+thread2.currentThread().getName());
		System.out.println("Current thread priority before Starting:"+thread2.currentThread().getPriority());
		System.out.println("Current thread state before Starting:"+thread2.currentThread().getState());
	    System.out.println(" ");
		thread2.start();
		thread3.setName("RunnableThread");
		System.out.println("Current Thread Name before Starting1:"+thread3.currentThread().getName());
		System.out.println("Current Thread Priority before Starting1:"+thread3.currentThread().getPriority());
		System.out.println("Current Thread State before Starting1:"+thread3.currentThread().getState());
		System.out.println(" ");
		thread3.start();
		break;
		
	case 4:
		System.out.println("Enter the name:");
		String name=input.nextLine();
		String name2=input.nextLine();
		String name4=input.nextLine();
		String name5=input.nextLine();
		String name6=input.nextLine();
		System.out.println("Enter the name:");
		String name1=input.nextLine();
		String name7=input.nextLine();
		String name8=input.nextLine();
		String name9=input.nextLine();
		String name10=input.nextLine();
		ExtendedThread customThread1=new ExtendedThread();
		ExtendedThread customThread2=new ExtendedThread();
		ExtendedThread customThread3=new ExtendedThread();
		ExtendedThread customThread4=new ExtendedThread();
		ExtendedThread customThread5=new ExtendedThread();
		customThread1.setName(name);
		customThread2.setName(name2);
		customThread3.setName(name4);
		customThread4.setName(name5);
		customThread5.setName(name6);
		customThread1.start();
		customThread2.start();
		customThread3.start();
		customThread4.start();
		customThread5.start();
		RunnableThread customRunnable1=new RunnableThread();
		Thread thread9=new Thread(customRunnable1);
		RunnableThread customRunnable2=new RunnableThread();
		Thread thread10=new Thread(customRunnable2);
		RunnableThread customRunnable3=new RunnableThread();
		Thread thread11=new Thread(customRunnable3);
		RunnableThread customRunnable4=new RunnableThread();
		Thread thread12=new Thread(customRunnable4);
		RunnableThread customRunnable5=new RunnableThread();
		Thread thread13=new Thread(customRunnable5);
		thread9.setName(name1);
		thread9.setName(name7);
		thread9.setName(name8);
		thread9.setName(name9);
		thread9.setName(name10);
		thread9.start();
		thread10.start();
		thread11.start();
		thread12.start();
		thread13.start();
		break;
	case 5:
//		System.out.println("Enter the number of thread for RunnableThread.");
//		int num=Integer.parseInt(input.nextLine());
//		for(int i=0;i<num;i++)
//		{
//		System.out.println("Enter the name:");
//		String threadName=input.nextLine();
//		System.out.println("Enter the time");
//		int time=Integer.parseInt(input.nextLine());
//		ExtendedThread cusThread1=new ExtendedThread(time);
//		cusThread1.setName(threadName);
//		cusThread1.start();
//		}
//		System.out.println("Enter the number of thread for RunnableThread.");
//		int num1=Integer.parseInt(input.nextLine());
//		for(int i=0;i<num1;i++)
//		{
//		System.out.println("Enter the name:");
//		String runnableThreadName=input.nextLine();
//		System.out.println("Enter the time");
//		int time1=Integer.parseInt(input.nextLine());
//		RunnableThread cusRunnable1=new RunnableThread(time1);
//		Thread thrd=new Thread(cusRunnable1);
//		thrd.setName(runnableThreadName);
//		thrd.start();
//		}
		break;
		
	case 6:
	    System.out.println("Enter the number of thread for RunnableThread.");
		int num=Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the name:");
		String threadName=input.nextLine();
        System.out.println("Enter the time");
		int time=Integer.parseInt(input.nextLine());
		
		for(int i=0;i<num;i++)
		{
		
		ExtendedThread cusThread1=new ExtendedThread(time);
		cusThread1.setName(threadName+i);
		cusThread1.start();
		}
		System.out.println("Enter the number of thread for RunnableThread.");
		int num1=Integer.parseInt(input.nextLine());
		
		System.out.println("Enter the name:");
		String runnableThreadName=input.nextLine();
		System.out.println("Enter the time");
		int time1=Integer.parseInt(input.nextLine());
		for(int i=0;i<num1;i++)
		{
		
		RunnableThread cusRunnable1=new RunnableThread(time1);
		Thread thrd=new Thread(cusRunnable1);
		thrd.setName(runnableThreadName+i);
		thrd.start();
		}
		break;
	case 7:
//		System.out.println("Enter the number of thread for RunnableThread.");
//		int num=Integer.parseInt(input.nextLine());
//		
//		System.out.println("Enter the name:");
//		String threadName=input.nextLine();
//		System.out.println("Enter the time");
//		int time=Integer.parseInt(input.nextLine());
//		for(int i=0;i<num;i++)
//		{
//		
//		ExtendedThread cusThread1=new ExtendedThread(time);
//		cusThread1.setName(threadName+i);
//		cusThread1.start();
//		}
//		System.out.println("Enter the number of thread for RunnableThread.");
//		int num1=Integer.parseInt(input.nextLine());
//		
//		System.out.println("Enter the name:");
//		String runnableThreadName=input.nextLine();
//		System.out.println("Enter the time");
//		int time1=Integer.parseInt(input.nextLine());
//		for(int i=0;i<num1;i++)
//		{
//		
//		RunnableThread cusRunnable1=new RunnableThread(time1);
//		Thread thrd=new Thread(cusRunnable1);
//		thrd.setName(runnableThreadName+i);
//		thrd.start();
//		}
//		for(int j=0;j<num;j++)
//		{
//			;
//		}
//		break;
    default:
    	System.out.println("Enter the correct number.");
	}
}
}
