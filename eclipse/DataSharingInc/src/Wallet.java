
public class Wallet {
	private int mMoney;
	
	public Wallet(){ mMoney = 0; }
	
	public int getMoney(){ return mMoney; }
	
	void addMoney(int money){
		for (int i = 0; i < money; i++){
			mMoney++;
		}
	}
}
