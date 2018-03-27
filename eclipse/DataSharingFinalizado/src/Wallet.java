import java.util.concurrent.Semaphore;

public class Wallet {
	private int mMoney;
	private Semaphore semaphore;
	
	public Wallet(){ 
		mMoney = 0; 
		semaphore = new Semaphore(1);
	}
	
	public int getMoney(){ return mMoney; }
	
	void addMoney(int money){
		try {
			semaphore.acquire();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < money; i++){
			mMoney++;
		}
		
		semaphore.release();
	}
}
