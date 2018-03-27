
public class Producer extends Thread {

	int id;
	Buffer buffer;
	
	public Producer(int id, Buffer buffer){
		this.id = id;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		super.run();
		
		while (true){
			if (!buffer.isDataAvailable()){
				int v = (int) (Math.random() * 1000);
				buffer.put(v);
				System.out.println("Produtor #" + id + " colocou " + v);
			}
				
			try {
				sleep((int)Math.random()*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}
