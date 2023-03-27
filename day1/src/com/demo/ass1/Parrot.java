package com.demo.ass1;

public class Parrot extends Bird {

	
	public Parrot(String name,String color,Boolean canFly) {
		// TODO Auto-generated constructor stub
		super(name,color,canFly);
	}
	
	@Override
	public String getDetails() {
		return Parrot.class.getSimpleName()+" " + super.getDetails();
		
	}

}
