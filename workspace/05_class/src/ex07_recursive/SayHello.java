package ex07_recursive;

public class SayHello {

	public void Say(int n) {

		if(n>0) {
			System.out.println("hello");
		Say(n-1);
		
		}
	}
}
