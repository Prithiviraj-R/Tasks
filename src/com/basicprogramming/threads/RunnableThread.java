package com.basicprogramming.threads;

public class RunnableThread implements Runnable
{
  public void run()
  {
	  System.out.println("Current Thread Name after Starting:"+Thread.currentThread().getName());
	  System.out.println("Current Thread Priority after Starting:"+Thread.currentThread().getPriority());
	  System.out.println("Current Thread State after Starting:"+Thread.currentThread().getState());
  }
}

  
