package ex07_recursive;

public class Calculator {

	public int getFactorial(int n) {
		if(n==1) {
			return 1;
		}
		return n*getFactorial(n-1);
	}
}
