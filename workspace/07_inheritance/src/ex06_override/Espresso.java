package ex06_override;

public class Espresso extends Coffee {
	private int water;

	public Espresso(String bean, int water) {
		super(bean);
		this.water = water;
	}

// espresso클래슨느이미 coffe 클래스 메소드 사용가능
	//espresso클래스가 coffe클래스의 taste 메소드를 사용하는것이 적절할까
	//No ! Espresso클래스는 자신의 맛을 표현하기 위해서 새롭게 taste 메소드를 만드는게좋다.
	//메소드 오버라이드
	//슈퍼클래스의 메소드를 사용 x 덮어씌울라고
	// 오버라이드 / 오버로딩 다름 주의
	//1. 똑같은 형태로 만들어야함
	//2.Override 
		//개발자가 자바에게 이 메소드는 오버라이드 하는거라고 알리는것
	@Override
	public void taste() {
		System.out.println("에스프레소는 향이 좋지만 맛은 약간 씁니다.");
	}
	

}
