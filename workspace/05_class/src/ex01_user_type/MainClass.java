package ex01_user_type;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//클래스 Person을 타입으로하나ㅡㄴ 객체생성
		Person p1 = new Person();
		//1. 타입 : person타입
		//2. 객체 : p1
		//클래스에 포함된 멤버(필드,메소드) (.)마침표를 이용해서 호출합니다.
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.height);
		System.out.println(p1.gender);
		System.out.println(p1.isKorean);
		
		System.out.println(p1);// new person()으로 생성된 객체의 주소
		Person p2 = p1;
		
		// 동일한 참조값을 가지고있는데 p2를 수정하면?
		
		p2.name ="ABC";
		System.out.println(p2.name);
		System.out.println(p1.name);
		//동일한 참조값임 . 주소에속한  name 을 바꿨으므로 p1 p2 는 같은주소를 가지므로 둘다 같은 값을가진다.
		//p1이 15란 주소를가지고 p2가 15란 주소를 같이 가지고있음. person.name의 주소가 15임. 
	
	}

}
