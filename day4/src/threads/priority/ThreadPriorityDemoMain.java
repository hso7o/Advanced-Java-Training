package threads.priority;

public class ThreadPriorityDemoMain {

	public ThreadPriorityDemoMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			Counter c1=new Counter();
			Counter c2=new Counter();
			Thread hi =  new Thread(c1);
			Thread lo =  new Thread(c2);
			
			hi.setPriority(Thread.NORM_PRIORITY+2);
			lo.setPriority(Thread.NORM_PRIORITY-2);
			
			hi.start();
			lo.start();
			
			Thread.sleep(10000);
			
			c1.stop();
			c2.stop();
			
			hi.join();
			lo.join();
			
			System.out.println("hi Priority thread ran: " + c1.counter);
			System.out.println("lo Priority thread ran: " + c2.counter);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
