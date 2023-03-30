package com.demo.ass;

import java.util.ArrayList;

import com.demo.ass.Models.*;

public class RunAss {

	public RunAss() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1,"Hardik","M",25000));
		empList.add(new Employee(2,"Joe","M",2000));
		empList.add(new Employee(3,"Chandler","M",35000));
		empList.add(new Employee(4,"Ross","M",55000));
		empList.add(new Employee(5,"Monica","F",22000));
		empList.add(new Employee(6,"Rachel","F",21000));
		empList.add(new Employee(7,"Phoebe","F",30000));
		empList.add(new Employee(8,"Damon","M",63000));
		empList.add(new Employee(9,"Stefan","M",25000));
		empList.add(new Employee(10,"Niklaus","M",15000));
		
		for(Employee emp : empList){
			System.out.println("Emp ID:"+emp.getId()+", Emp Name:"+emp.getName()+", Emp Gender:"+emp.getGender()+", Emp Salary:"+emp.getSalary());
		}

	}

}
