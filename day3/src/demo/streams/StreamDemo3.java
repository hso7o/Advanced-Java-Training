package demo.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;



public class StreamDemo3 {

	public StreamDemo3() {
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
		
		empList.forEach(x->System.out.println(x.getName()));
		empList.stream().map(s->s.getName()).sorted().forEach(System.out::println);
		
		Double salarytotal=empList.stream().mapToDouble(x->x.getSalary()).sum();
		System.out.println(salarytotal);
		empList.stream().filter(x->x.getGender()=="F").mapToDouble(x->x.getSalary()).boxed().collect(Collectors.toList()).forEach(System.out::println);
		List<Employee> newemplist=empList.stream().filter(x->x.getSalary()<=30000).map(x->{
			x.setSalary(x.getSalary()+10000);
			return x;
			}).collect(Collectors.toList());
		newemplist.forEach(e->System.out.println(e.getName()+"-->"+e.getSalary()));
	}

}
