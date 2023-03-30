package threads.basics;

public class ThreadmainBasics {

	public ThreadmainBasics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		try {
			Thread.currentThread().setPriority(7);
			MyThread t1=new MyThread("Thread1");
			
			MyThread t2=new MyThread("Thread2");
			t2.setPriority(8);
			t1.start();
			t2.start();
			
			System.out.println(Thread.currentThread()+ ","+t1.getThreadName()+","+t2.getThreadName());
			t1.join();
			
			t2.join();
			
			System.out.println(t1.isAlive());
			System.out.println(t2.isAlive());
			
			System.out.println(Thread.currentThread().getName()+" Exited..");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
