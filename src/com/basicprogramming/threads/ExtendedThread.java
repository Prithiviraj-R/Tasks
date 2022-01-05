package com.basicprogramming.threads;

public class ExtendedThread extends Thread
{
   public void run()
   {
	   System.out.println("Current thread name after Starting:"+currentThread().getName());
	   System.out.println("HI");
	   System.out.println("Current thread priority after Starting:"+currentThread().getPriority());
	   System.out.println("Current thread state after Starting:"+currentThread().getState());
	 //  System.out.println("Going to Sleep: "+currentThread().setName("hello"));
	  // Thread.sleep(60000);
	 //  System.out.println(After sleeping: “+threadName);
   }
}
