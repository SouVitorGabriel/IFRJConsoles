
public class Main {
	Wallet wallet;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wallet w = new Wallet();
		
		int numThreads = 3;
		WalletThread []threads = new WalletThread[numThreads];
		
		
		for (int i = 0; i < numThreads; i++){
			threads[i] = new WalletThread(w);
			threads[i].start();
		}
		
		
		for (int i = 0; i < numThreads; i++){
			try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if (w.getMoney() != numThreads * 10000){
			System.out.println("Erro durante a contagem. Valor esperado: " + numThreads * 10000 + 
					" Valor encontrado: " + w.getMoney());
		}
	}

}
