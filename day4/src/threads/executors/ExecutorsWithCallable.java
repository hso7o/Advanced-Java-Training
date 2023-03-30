package threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorsWithCallable {

	public static void main(String[] args) throws Exception {
		ExecutorService es = Executors.newCachedThreadPool();
		
		/*
		 * Future<String> result1=es.submit(new CaseChanger("hello hi how are you?"));
		 * System.out.println("Call Done..."); while(!result1.isDone()) {
		 * System.out.println("Waiting for result...."); Thread.sleep(2000); }
		 * System.out.println("Result:- "+result1.get());
		 * 
		 * 
		 */
		
		Future<Integer> result2 = es.submit(new Factorial(6));
		System.out.println("Call Done..."); while(!result2.isDone()) {
			 System.out.println("Waiting for result...."); Thread.sleep(2000); }
			  System.out.println("Result:- "+result2.get());
			  
			 es.shutdown();
		

	}

}
