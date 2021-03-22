package ex08_static;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KoreanMainClass korean1 =new KoreanMainClass();
		
		//인스턴스 필드에 접근합니다
		korean1.name = "홍길동";
		//클래스필드에 접근
		System.out.println(korean1.CONTRY); //인스턴스로 접근 ,추천하지않음
		System.out.println(KoreanMainClass.CONTRY);//클래스로 접근
		
	}

}
