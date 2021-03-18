package ex01_variable;

public class Ex03_primitive_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수타입
		//1.byte
		// 크기가 1byte,단독사용은 아니고 배열로 사용
		System.out.println(Byte.MAX_VALUE);
		
		//8비트 : -2의 7제곱 ~ 2의 7제곱 -1
		//n비트 : -2의 (n-1)제곱 / 2의(n~1)제-1곱
		
		//3.int 타입
		//4.long type
		//크기 8바이트, int 보다 클전숭 자료형
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Double.MAX_EXPONENT);
		System.out.println(Double.MIN_EXPONENT);
	
		//문자타입
		// 1.char타입
		//크기 2바이트, 유니코드기반(국제 표준 코드)
		System.out.println(Character.SIZE);
		//논리타입
		//1.boolean
		//크기가 이론상 1비트 (참 or 거짓)
		
		
		
		//변수선언
		int a = 10;
		long b =1234567890L;
		char c = 'a';
		float f = 1.5f;
		double d = 1.5;
		boolean e = true;
		//primitive type 은 변수에 데이터가 그대로 저장되는 특징.
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		
	}

}
