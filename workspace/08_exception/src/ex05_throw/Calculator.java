package ex05_throw;

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

	public void divison(int a) throws ArithmeticException {// 2. division메소드가 어떤예외를 던지는지 명시합니ㅏㄷ.
		if(a==0) {
			throw new ArithmeticException();//1. 예외를 직접 던짐.
		}
		this.result/=a;
		System.out.println("저장된값 : " + result);
		
	}

	

}
