package streams.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLabsdemo {

	public StreamLabsdemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student("Hardik",25,new Address("380058"),
				Arrays.asList(new MobileNumber("6543132354"), new MobileNumber("9876565432")));
		Student st2 = new Student("Hardik",25,new Address("380058"),
				Arrays.asList(new MobileNumber("6543132354"), new MobileNumber("9876565432")));
		Student st3 = new Student("Hardik",25,new Address("380058"),
				Arrays.asList(new MobileNumber("6543132354"), new MobileNumber("9876565432")));
		Student st4 = new Student("Hardik",25,new Address("380058"),
				Arrays.asList(new MobileNumber("6543132354"), new MobileNumber("9876565432")));
		
		List<Student> studentList = Arrays.asList(st1,st2,st3,st4);
		
		Optional<Student> opSt=studentList.stream().filter(x->x.getName().equals("hardik")).findFirst();
		System.out.println(opSt.isPresent()?opSt.get():"Not Found");
		
		//studentList.stream().filter(null)

	}

}
