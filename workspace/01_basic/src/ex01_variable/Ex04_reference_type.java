package ex01_variable;

public class Ex04_reference_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//reference type 
		//primitive type 을 제외한 모든 type(자료형)
		String s1 = "apple";
		String s2 = new String("apple");
		//s1에 저장된 데이터
		//"apple"이 저장되어있는 메모리 주소(참조)값이 저장되어있다.
		System.out.println(s1==s2);
		// 두 apple이 저장된 주소가 다르다
	}

}
