package com.demo.ass1;

public class RunDemo {

	public RunDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird parrotObj = new Parrot("Debbie","Green",true);
		System.out.println(parrotObj.getDetails());
		Bird eagleObj = new Eagle("Carl","White",true);
		System.out.println(eagleObj.getDetails());
		Bird duckObj = new Duck("Fiona","White",false);
		System.out.println(duckObj.getDetails());
	}

}
