package threads.pc.consumer;

import threads.pc.SharedQueue;

public class Consumer implements Runnable {

	private SharedQueue queue;
	
	public Consumer(SharedQueue queue) {
		this.queue = queue;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				queue.get();
				Thread.sleep(200);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
