package com.demo.ass2;

public class Triangle extends Figure {

	public Triangle(String name, Integer dim1,Integer dim2) {
		// TODO Auto-generated constructor stub
		super(name,dim1,dim2);
	}

	@Override
	public Integer area() {
		// TODO Auto-generated method stub
		return super.getDim1()*super.getDim2();
	}

}
