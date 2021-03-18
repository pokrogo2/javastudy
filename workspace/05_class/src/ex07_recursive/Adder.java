package ex07_recursive;

public class Adder {

	private int total; //0;
	public void calculate(int n) {
		if(n==0) {
		
			return;
		}
		total+=n;
		n--;
		calculate(n);
		
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}

	
}
