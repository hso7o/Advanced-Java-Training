package threads.basics;

public class MyThread extends Thread {

	private String threadName;
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	public MyThread(String name) {
		// TODO Auto-generated constructor stub
		threadName=name;
	}
	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Thread name : " + threadName +" Iteration : "+i);
				Thread.sleep(2000);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
