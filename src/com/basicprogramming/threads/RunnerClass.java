package com.basicprogramming.threads;

import java.util.ArrayList;
import java.util.List;
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
		Thread thread9=new Thread(customRunnable1,name1);
		RunnableThread customRunnable2=new RunnableThread();
		Thread thread10=new Thread(customRunnable2,name7);
		RunnableThread customRunnable3=new RunnableThread();
		Thread thread11=new Thread(customRunnable3,name8);
		RunnableThread customRunnable4=new RunnableThread();
		Thread thread12=new Thread(customRunnable4,name9);
		RunnableThread customRunnable5=new RunnableThread();
		Thread thread13=new Thread(customRunnable5,name10);
		thread9.start();
		thread10.start();
		thread11.start();
		thread12.start();
		thread13.start();
		break;
	case 5:
		System.out.println("Enter the number of thread ");
		int num=Integer.parseInt(input.nextLine());
		for(int i=0;i<num;i++)
		{
		ExtendedThread cusThread1=new ExtendedThread(30000);
		cusThread1.setName("ExtendedThread"+i);
		cusThread1.start();
		}
		for(int i=0;i<num;i++)
		{
		RunnableThread cusRunnable1=new RunnableThread(45000);
		Thread thrd=new Thread(cusRunnable1,"RunnableThread"+i);
		thrd.start();
		}
		break;
		
	case 6:
	    System.out.println("Enter the number of thread.");
		int number=Integer.parseInt(input.nextLine());		
		for(int i=0;i<number;i++)
		{
		
		ExtendedThread cusThread1=new ExtendedThread(10000);
		cusThread1.setName("ExtendedThread"+i);
		cusThread1.start();
		
		RunnableThread cusRunnable1=new RunnableThread(6000);
		Thread thrd=new Thread(cusRunnable1);
		thrd.setName("runnableThread"+i);
		thrd.start();
		}
		break;
	case 7:
		System.out.println("Enter the number of thread.");
		int noOfThreads=Integer.parseInt(input.nextLine());	
		List<ExtendedThread> arrayList=new ArrayList();
		List<RunnableThread> arrayList2=new ArrayList();
		List<Thread> arrayList3=new ArrayList();
		for(int j=0;j<noOfThreads;j++)
		{
		ExtendedThread cus1=new ExtendedThread(15000);
		arrayList.add(cus1);
		cus1.setName("ExtendedThread"+j);
		cus1.start();
		RunnableThread cus2=new RunnableThread(20000);
		arrayList2.add(cus2);
		Thread cus3=new Thread(cus2);
		cus3.setName("Runnable"+j);
		cus3.start();
		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<noOfThreads;i++)
		{
			ExtendedThread thrd1=arrayList.get(i);
			thrd1.threadkill();
			try {
				Thread.sleep(60000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			RunnableThread thrd2=arrayList2.get(i);
			thrd2.threadkill();
		}
//		System.out.println("Enter the number of thread.");
//		int noOfThreads=Integer.parseInt(input.nextLine());	
//		ExtendedThread[] array=new ExtendedThread[noOfThreads];
//		RunnableThread[] array2=new RunnableThread[noOfThreads];
//		Thread[] array3=new Thread[noOfThreads];
//		for(int j=0;j<noOfThreads;j++)
//		{
//		array[j]=new ExtendedThread(15000);
//		array[j].setName("ExtendedThread"+j);
//		array[j].start();
//		array2[j]=new RunnableThread(20000);
//		array3[j]=new Thread(array2[j]);
//		array3[j].setName("Runnable"+j);
//		array3[j].start();
//		}
//		try {
//			Thread.sleep(6000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for(int i=0;i<noOfThreads;i++)
//		{
//			array[i].killing();
//			try {
//				Thread.sleep(60000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			array2[i].killing();
//		}
		break;
    default:
    	System.out.println("Enter the correct number.");
	}
}
}
