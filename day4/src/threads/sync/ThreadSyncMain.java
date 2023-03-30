package threads.sync;

public class ThreadSyncMain {

	public ThreadSyncMain() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			/*
			 * MessagePrinter mp = new MessagePrinter(); Thread t1=new Thread(new
			 * PrintWorker(mp, "hello from t1")); Thread t2=new Thread(new PrintWorker(mp,
			 * "hello from t2")); Thread t3=new Thread(new PrintWorker(mp,
			 * "hello from t3"));
			 * 
			 * t1.start(); t2.start(); t3.start();
			 * 
			 * t1.join(); t2.join(); t3.join();
			 */
			
			TableGenerator generator = new TableGenerator();
			Thread t1= new Thread(new TableWorker(generator, 5));
			Thread t2= new Thread(new TableWorker(generator, 6));
			Thread t3= new Thread(new TableWorker(generator, 7));
			
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
