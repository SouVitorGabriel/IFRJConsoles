
public class Buffer {

	int value;
	boolean dataAvailable = false;
	
	public void put(int v){
		value = v;
		dataAvailable = true;
	}
	
	public int get(){
		dataAvailable = false;
		return value;
	}
	
	public boolean isDataAvailable(){
		return dataAvailable;
	}
}
