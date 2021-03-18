package Quiz02;

public class Calculator {

	//method
	//결과타입 : 결과값이 없다
	//메소드명 add
	//매개변수 : 전달인수 2개 int 
	//역할 전달된 인수의 합
	// 전달 1 2  >> 1 + 2 =3
	
	void add(int a,int b) {
		int c=a+b;
		System.out.println(a+"+"+b+"="+c);
	}
	
	int sub(int a,int b) {

		if(a>=b) {
			return a-b;
		}
		else {
			return b-a;
		}
	
	}
}
