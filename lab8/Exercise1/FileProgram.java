package com.capgemini.lab8.Exercise1;

import java.io.File;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sn_source=new File("C:\\CapgeminiJA17\\Optionalassignment\\src\\com\\capgemini\\lab8\\Exercise1\\Source.txt");
		File sn_target=new File("C:\\CapgeminiJA17\\Optionalassignment\\src\\com\\capgemini\\lab8\\Exercise1\\Target.txt"); // initializing Shrijit Majumder's target file
		CopyDataThread c = new CopyDataThread(sn_source,sn_target);
		c.start();
	}
}
