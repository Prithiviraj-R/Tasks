package com.basicprogramming.threads;

public class RunnableThread implements Runnable
{
  public RunnableThread()
  {
	  
  }
  public int time;
  public RunnableThread(int time)
  {
	  this.time=time;
  }
  public void run()
  {
	  try
	  {
	  System.out.println("Current Thread Name after Starting:"+Thread.currentThread().getName());
	  System.out.println("Current Thread Priority after Starting:"+Thread.currentThread().getPriority());
	  System.out.println("Current Thread State after Starting:"+Thread.currentThread().getState());
	  System.out.println("Going to sleep:"+Thread.currentThread().getName());
	  Thread.sleep(time);
	  System.out.println("After sleeping:"+Thread.currentThread().getName());
	  int i=0;
	  while(i<8)
	  {
		  System.out.println("value is true");
		  i=i+1;
	  }
	  } 
	  catch (InterruptedException e)
	  {
		e.printStackTrace();
	  }
  }
}

  
