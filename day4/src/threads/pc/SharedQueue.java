package threads.pc;

public class SharedQueue {

	private int data;
	volatile boolean valueSet = false;
	
	public synchronized void put(int data) {
		if(valueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		this.data=data;
		System.out.println("put : "+ data);
		valueSet=true;
		notifyAll();
		
	}
	
	public synchronized void get() {
		if(!valueSet) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		this.valueSet=false;
		System.out.println("get : " +data);
		notifyAll();
	}
}
