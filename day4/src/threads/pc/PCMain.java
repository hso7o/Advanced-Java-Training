package threads.pc;

import threads.pc.consumer.Consumer;
import threads.pc.producer.Producer;

public class PCMain {

	public PCMain() {
		
	}

	public static void main(String[] args) {
		try {
			SharedQueue queue = new SharedQueue();
			
			Thread producer = new Thread(new Producer(queue));
			Thread consumer = new Thread(new Consumer(queue));
			
			producer.start();
			consumer.start();
			
			producer.join();
			consumer.join();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
