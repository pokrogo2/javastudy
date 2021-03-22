package ex01_generic;

//제네릭
//일반화된 타입을 이용해서 클래스 또는 메소드를 정의해 두고,
//객체생성이나 메소드를 호출할 때
//구체적으로 타입 지정
public class Box <T>{ // 박스 생성시 box<String> 같이 사용.String 이 T에들어가고 Box<int>면 T에 int가들어간다.

	private T item; // T는 무엇이든 저장가능한 타입

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
}
