package com.demo.ass1;

public abstract class Bird {
private String name;
private String color;
private Boolean canFly;


public Bird(String name, String color, Boolean canFly) {
	this.name=name;
	this.color=color;
	this.canFly=canFly;
}

public String getDetails() {
	return name + " with " + color + " color" +(canFly==true?" can Fly." : " cannot Fly.");
}
}
