package ex17_Object.ex01;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object클래스
		//모든클래스의 최상위 슈퍼클래스
		//extends안함. 자동으로됨.
		//모든 데이터는 Object타입으로 저장할수있습니다.
		Object obj1 = 1;
		Object obj2 = 2.13;
		Object obj3 = new Dog();
		Object obj4= "사람";
		System.out.println(obj1);
		System.out.println(obj2);
		((Dog)obj3).move();
		System.out.println(obj4);
		//object에 저장된 객체는
		//캐스팅 후 사용

	}

}
