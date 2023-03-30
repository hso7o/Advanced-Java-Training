package threads.executors;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer> {

	private Integer number;

	public Factorial(int number) {
		this.number = number;
	}
	
	@Override
	public Integer call() throws Exception {
		Thread.sleep(5000);
		return factorial(number);
	}
	
	private Integer factorial(int  num) {
		if(num==0)
			return 1;
		else
			return (num*factorial(num-1));
	}
}
