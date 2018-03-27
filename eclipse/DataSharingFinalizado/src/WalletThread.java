
public class WalletThread extends Thread {
	public Wallet wallet;
	
	public WalletThread(Wallet w){
		wallet = w;
	}
	
	public void run() {
		wallet.addMoney(10000);
	}
}
