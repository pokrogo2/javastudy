package ex02_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4.관계연산자 : >, >=,<, <=,==,!=
		//결과 타입은 boolean
		
		int age = 20;
		boolean isAdult = age>=20;
		System.out.println(isAdult);
		
		//5.논리연산자 :&&,||,!
		//관계연산자와 함께 사용.
		//1) && : 모든 관계연산의 결과가 true면 true 아니면 false
		//2) || : 관계연산의 결과가 하나라도 true면 true 아니면 false
		//3) ! : 관계연산의 결과를 반대로 변경
		int a = 10;
		int b= 10;
		System.out.println(a==10&&b==10);
		System.out.println(a==10 || b==9);
		System.out.println(!(a==10));
		System.out.println(a==0&&++b>0); //false(&&연산은 false가 나오면 연산을멈춘다. a==0에서 false ++b는 진행되지않음.)
		System.out.println(a);
		System.out.println(++b);
		System.out.println(b);
		
		
		System.out.println(a==10 || ++b>0);//true (||는 true가나오면 연산을 멈춤. ++b는진행되지않음.)
	}

}
