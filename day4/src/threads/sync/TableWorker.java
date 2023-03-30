package threads.sync;

public class TableWorker implements Runnable {

	private TableGenerator tablegenerator;
	private int number;
	
	public TableWorker(TableGenerator tablegenerator, int number) {
		super();
		this.tablegenerator = tablegenerator;
		this.number = number;
	}
	

	@Override
	public void run() {
		synchronized (tablegenerator) {
			tablegenerator.generateTable(number);
		}
		// TODO Auto-generated method stub
		
	}

}
