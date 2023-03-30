package threads.sync;

public class MessagePrinter {

	public MessagePrinter() {
		// TODO Auto-generated constructor stub
	}
	
	public void print(String message) {
		try {
			System.out.print("["+message);
			Thread.sleep(2000);
			System.out.println("]" );
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
