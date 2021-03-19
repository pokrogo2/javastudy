package quiz01;

public class Calculator {
	
	private int result;
	
	public void add(int a) {
		this.result+=a;
		System.out.println("저장된값 : " + result);
		
	}
	public void sub(int a) {
		this.result-=a;
		System.out.println("저장된값 : " + result);
		
	}

	public void mul(int a) {
		this.result*=a;
		System.out.println("저장된값 : " + result);
		
	}

	public void divison(int a) {
		this.result/=a;
		System.out.println("저장된값 : " + result);
		
	}

	

}
