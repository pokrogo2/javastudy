package ex01;

public class Person extends Thread{/*

		스레드
		자바의 세부작업단위
		생성방법	
		1)Thread 클래스를 상속받음 extends Tread
		2)Runnable인터페이스를 구현(implements Runnable)
		기본규칙
		1)run()메소드 : 스레드의 작업을 작성하는 메소드. 오버라이드해서 사용.
		2.start()메소드 : 스레드를 실행하는 메소드 .run메소드를 호출하지않습니다.
*/

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	//method
	public void eat() {
		
			System.out.println(name + "이(가) 먹는중");
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i =0; i<3; i++) {
			eat();
		}
	}
	
	
}
