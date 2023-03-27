package com.demo.ass1;

public class Eagle extends Bird
{

	public Eagle(String name,String color,Boolean canFly) {
		// TODO Auto-generated constructor stub
		super(name,color,canFly);
	}

	@Override
	public String getDetails() {
		return Eagle.class.getSimpleName() +" "+super.getDetails();
		
	}
}
