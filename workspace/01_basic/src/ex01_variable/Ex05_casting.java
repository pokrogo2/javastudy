package ex01_variable;

public class Ex05_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//casting : 다른 타입으로 변환
		//자동형변환 : promotion
		
		System.out.println(1+1.5);// 1 + 1.5 > promotion 1.0+1.5
		//강제 형 변환 : casting
		int a = 1;
		double b = 1.5;
		System.out.println(a + (int)b); // b를 잠시 int 변환
	}

}
