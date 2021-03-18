package ex08_upcasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv(200,"LG75");
		tv.info(); //tv인포
		Elec elec = tv;// 업캐스팅 tv타입의 객체를 Elec 타입으로 변경
						// sub->super 타입으로 변경하는것을 업캐스팅이라한다.
						//업캐스팅은 별도의 문법이없음.
		elec.info(); // elec클래스의 인포를 호출
		// 메소드의 호출
		// 1. 객체의 타입에따라 결정
		//2. 자바는 동적바인딩이다.
		// 	1) 메소드 호출 시점(실행전)에는 객체 타입을 봅니다. Elec elec =Tv 이므로 elec.info는 Elec의 info다
		//	2)실제 객체를 확인합니다.
		//		Tv tv = new Tv(200,"LG75");이므로 tv객체가 Tv타입이라는 것을 확인.
		//	3)실제 객체타입으로 바꿔서 호출
		//	elec.info 가실행될때 tv info가호출됨
		Elec elec2 = new Tv(300,"Samsung-24");
		elec2.info();
	}

}
