package ex05_access;

public class Person {

	//접근 제어자
	//private : 클래스 내부에서만 볼수있다.
	//default : 같은 패키지에서만 볼수있다. access modifier을 지정하지않음.
	//protected : 같은패키지 or 상속 다른 패키지에서만 볼수있다.
	//public : 어디서든 볼 수 있다
	
	//지정방법
	//필드는 private
	//메소드(생성자,일반메소드)는 public합니다.
	
	
	private String name;
	private int age;
	private boolean Korean;
	//method , name에 접근할 수 있는 메소드, 전달할 메소드
	
	//setter
	//getter
	
	public void setName(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public void setKorean(boolean isKorean) {
		this.Korean=isKorean;
		
	}
	public boolean getKorean() {
		return Korean;
		
		
	}
}
