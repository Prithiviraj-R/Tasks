package com.basicprogramming.threads;

public class ExtendedThread extends Thread
{
   public ExtendedThread()
   {
	   
   }
   public int time;
   int i;
   public void set(int i)
   {
	   this.i=i;
   }
   public ExtendedThread(int time)
   {
	   this.time=time;
   }

public void run()
   {
	   try
	   {
		   while(i<8)
			  {
		System.out.println("Current thread name after Starting:"+currentThread().getName());
        System.out.println("Current thread priority after Starting:"+currentThread().getPriority());
        System.out.println("Current thread state after Starting:"+currentThread().getState());
		System.out.println("Going to sleep:"+currentThread().getName());
		Thread.sleep(time);
		System.out.println("After sleeping:"+currentThread().getName());
		  
			  System.out.println("value is true");
		  }
	   }
	   catch (InterruptedException e)
	   {
		e.printStackTrace();
	   }   
   }
}
