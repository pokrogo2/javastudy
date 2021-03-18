package ex04_this;

public class Car {

	
	String model;
	String manuf;
	int price;
	void set(String model,String manuf,int price) {
		this.model=model;//this==myCar
		this.manuf=manuf;
		this.price=price;
	}
	void info() {
	System.out.println("모델명  : "+model);
	System.out.println("제조사  : "+manuf);
	System.out.println("가격    : "+price);
		// this는 자기 자신을 의미한다
		//어떤 클래스 내부에서만 사용합니다.
		//this.필드 (가장 주된 활용)
		//this() 다른 생성자를 호출하는것을의미
		
	}
}
