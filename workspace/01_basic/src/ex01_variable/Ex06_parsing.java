package ex01_variable;

public class Ex06_parsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String 타입 형변환은 parsing이다.
		/*
		int a = 10;
		System.out.println((String)a);//casting 안됨.
		String b= "10";
		System.out.println((int)b);//casting 안됨

	
	*/
		//1. 정수 int를 문자열로
		int a = 10;
		String a1 = String.valueOf(a);
		String a2 = "" + a;//문자열의 +연산은 연결. 결과도 문자열

	
		System.out.println(a1);
		System.out.println(a2);
	
		//2. 문자열 String을 정수 int로 변환하기
		String b = "123";
		int bb = Integer.parseInt(b);
		
		//3. 문자열 String을 실수 double로 변환
		String c = "1.5";
		double cc = Double.parseDouble(c);
		System.out.println(bb);
		System.out.println(cc);
	}

}
