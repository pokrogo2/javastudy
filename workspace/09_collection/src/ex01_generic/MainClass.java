package ex01_generic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box<String> box1 = new Box<String>(); //구체화 진행 (Box의 모든 T가 String으로 변환된 뒤 실행)
		//Box<String> box1 = new Box<>(); 위아래 같은코드 구체화는 한번만해도 딱히상관없다는소리임.
		Box<Integer> box2 = new Box<>(); //기본자료형이아닌 참조자료형 int가아닌 Integer
		box1.setItem("헬로");
		box2.setItem(5);
		System.out.println(box1.getItem());
		System.out.println(box2.getItem());
		Box<Fruit> box3 = new Box<>();
		box3.setItem(new Fruit("apple",1100));

		System.out.println(box3.getItem());
	}

}
