package ex13_interface;

public interface Shape {//인터페이스는 < 조건만맞다면. abstract와 같다.
	//인터페이스는 public abstract를 생략해도
	
	//method
	public double getArea();
	//모든 도형은 크기가 있다.
	
	
	//모든 메소드가 추상메소드인 추상클래스 == 인터페이스
	// jdk 1.8 이후 default 메소드와 static 메소드를 가질 수 있습니다.
	// 모든 필드는 final상수를 가짐
}
