package com.demo.ass2;

public abstract class Figure {

	private Integer dim1;
	private Integer dim2;
	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDim1() {
		return dim1;
	}

	public void setDim1(Integer dim1) {
		this.dim1 = dim1;
	}

	public Integer getDim2() {
		return dim2;
	}

	public void setDim2(Integer dim2) {
		this.dim2 = dim2;
	}

	
	public Figure(String name, Integer dim1,Integer dim2) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.dim1=dim1;
		this.dim2=dim2;
	}
	
	public abstract Integer area();

}
