package com.demo.ass1;

public class Duck extends Bird{

	public Duck(String name,String color, Boolean canFly) {
		// TODO Auto-generated constructor stub
		super(name,color,canFly);
	}

	@Override
	public String getDetails() {
		return Duck.class.getSimpleName()+" "+super.getDetails();
		
	}
}
