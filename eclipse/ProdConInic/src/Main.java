
public class Main {
	
	public static void main(String[] args) {
		
		Buffer buffer = new Buffer();
		
		Producer p = new Producer(1, buffer);
		Producer p2 = new Producer(2, buffer);
		Consumer c = new Consumer(1, buffer);
		Consumer c2 = new Consumer(2, buffer);
		
		p.start();
		p2.start();
		c.start();
		c2.start();
	}

}
