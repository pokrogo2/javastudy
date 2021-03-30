package ex03_join;

public class Calculator extends Thread{

	int result;
	int from;
	int to;
	@Override
	public void run() {
		addition();
		
	}
	public void addition() {
		if(from>to) {
			int t=from;
			from =to;
			to=t;
			
		}
		for(int n = from; n<=to; n++) {
			result+=n;
		}
	}

	public int getFrom() {
		return from;
	}
	public void setFrom(int from) {
		this.from = from;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	
}
