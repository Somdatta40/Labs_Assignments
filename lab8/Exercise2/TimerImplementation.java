package com.capgemini.lab8.Exercise2;

import java.time.LocalTime;

public class TimerImplementation implements Runnable{

	public synchronized void display() {
		  LocalTime time = LocalTime.now();
	      System.out.println(time);
	   }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Current Time: ");
		while (true) {
			try {
				display();
				Thread.sleep(10000);
				System.out.println("Time after 10 sec: ");
				
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
