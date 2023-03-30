package threads.sync;

public class PrintWorker implements Runnable {

	private MessagePrinter messageprinter;
	private String message;
	
	public PrintWorker(MessagePrinter messageprinter, String message) {
		this.messageprinter = messageprinter;
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		messageprinter.print(message);
	}

}
