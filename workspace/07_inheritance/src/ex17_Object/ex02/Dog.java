package ex17_Object.ex02;

public class Dog {
	private String name;

	public Dog(String name) {
		super(); //object의 생성자 호출 (생략가능)
		this.name = name;
	}

	
	

	//method
	// toString을 사용하지않기 위해
	//toString() 메소드를 오버라이드 합니다.
	@Override
	public String toString() {
		return "[name : " + name + "]";
	}
}
