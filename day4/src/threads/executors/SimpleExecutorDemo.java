package threads.executors;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import threads.basics.MyRunnable;

public class SimpleExecutorDemo {

	public static void main(String[] args) {
		//ExecutorService service = Executors.newSingleThreadExecutor();
		//ExecutorService service = Executors.newFixedThreadPool(2);
		ExecutorService service = Executors.newCachedThreadPool();
		service.execute(new MyRunnable());		
		service.execute(new MyRunnable());
		service.execute(new MyRunnable());
		service.execute(new MyRunnable());
		service.shutdown();

	}

}
