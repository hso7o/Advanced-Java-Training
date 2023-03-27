package com.demo.ass2;

public class RunAssignment {

	public RunAssignment() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Figure squareObj = new Square("Square",5,10);
		System.out.println(squareObj.getName() + " have area "+squareObj.area());
		Figure triangleObj = new Triangle("Triangle",6,10);
		System.out.println(triangleObj.getName() + " have area "+triangleObj.area());
	}

}
