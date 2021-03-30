package ex01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 =new Person("자두");
		Person p2 =new Person("스폰지밥");
		Person p3 =new Person("브레드");
	
	
		//코드 작성 순서대로 작동하지않음.
		p1.start();//p1의 run알아서 실행
		p2.start();
		p3.start();
	
	
	
	
	
	}

}
