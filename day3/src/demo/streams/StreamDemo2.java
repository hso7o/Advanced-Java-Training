package demo.streams;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

	public StreamDemo2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names=Arrays.asList("hardik","pavan","sachin","dexter","deelip","nikhil","mitesh","deep");
		
		names.stream().filter(x-> x.length()>4).map(x->"Welcome " +x).forEach(x->System.out.println(x));

	}

}
