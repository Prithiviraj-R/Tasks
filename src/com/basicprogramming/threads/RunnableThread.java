package com.basicprogramming.threads;

public class RunnableThread implements Runnable
{
  public int time;
  boolean i=false;
  public RunnableThread()
  {
	  
  }
  public void threadkill()
  {
	  i=true;
  }
  public RunnableThread(int time)
  {
	  this.time=time;
  }
  public void run()
  {
	  try
	  {
		  while(!i)
		  {
	  System.out.println("Current Thread Name after Starting:"+Thread.currentThread().getName());
	  System.out.println("Current Thread Priority after Starting:"+Thread.currentThread().getPriority());
	  System.out.println("Current Thread State after Starting:"+Thread.currentThread().getState());
	  System.out.println("Going to sleep:"+Thread.currentThread().getName());
	  Thread.sleep(time);
	  System.out.println("After sleeping:"+Thread.currentThread().getName());
	  System.out.println("value is true");
	  }
	  } 
	  catch (InterruptedException e)
	  {
		e.printStackTrace();
	  }
	  System.out.println("Stopped");
  }
}

  
