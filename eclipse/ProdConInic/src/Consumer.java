
public class Consumer extends Thread {
	
	int id;
	Buffer buffer;
	
	public Consumer(int id, Buffer buffer){
		this.id = id;
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		super.run();
		
		while (true){
			
			if (buffer.isDataAvailable()){
				int v = buffer.get();
		
				System.out.println("Consumidor #" + id + 
						" pegou o valor " + v);
			}
			
			try {
				sleep( (int) (Math.random() * 100) );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
