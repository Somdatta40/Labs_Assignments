package com.capgemini.lab9.question4;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=8;
		Number nm=new Number();
		Reference ref=(nm::getNum);
		
		ref.getNumber();
		Reference1 ref1=(nm::setNum);
		ref1.setNumber(num);
	}

}
