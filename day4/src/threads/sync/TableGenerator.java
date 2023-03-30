package threads.sync;

public class TableGenerator {
	public void generateTable(int num) {
		String tname=Thread.currentThread().getName();
		try {
			for(int i=1; i<=10; i++) {
				System.out.println(tname+" printing : ["+num+" X " + i + " = "+ (num*i) + "]");
				Thread.sleep(1000);
			}
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
