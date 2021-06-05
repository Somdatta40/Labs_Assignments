package com.capgemini.lab8.Exercise2;

public class TimerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimerImplementation ti=new TimerImplementation();
		Thread th=new Thread(ti);
		th.start();
	}

}
