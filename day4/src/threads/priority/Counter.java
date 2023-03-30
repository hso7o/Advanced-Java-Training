package threads.priority;

public class Counter implements Runnable {

	long counter=0;
	public volatile boolean running = true;
	public Counter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (running) {
			counter++;
		}
	}
	
	public void stop() {
		// TODO Auto-generated method stub
		running=false;
	}

}
