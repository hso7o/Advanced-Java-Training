package com.demo.Exceptions;

public class ExceptionDemo1 {

	public ExceptionDemo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=20;
		int b=10;
		double c=a/b;
		int[] nums= {1,2,3,4};
		System.out.println("NoException..");
		System.out.println("Normal Exceution."+c);
		try {
			int d=20;
			int e= 0;
			double f= d/e;
			System.out.println("Normal Exceution."+f);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Exception message."+e.getMessage());
		}
		finally {
			System.out.println("Finally Exceution.");
		}
	}

}
