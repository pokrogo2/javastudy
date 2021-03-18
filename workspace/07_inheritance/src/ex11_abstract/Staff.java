package ex11_abstract;
//추상메소드
	//본문이 없는 메소드
	//메소드를 정의할때 앞에 abstract를 추가
	//중괄호도 빼고 세미콜론으로 끝냄
//추상클래스
//	추상메소드가 1개이상포함된 클래스
//	클래스 정의 앞에 abstract키워드 추가
// 	오버라이드 필수
public abstract class Staff {

	private String name;

	public Staff(String name) {
		super();
		this.name = name;
	}

	public void info() {
		System.out.println(name);
	}
	public abstract int getPay(); 
		//모르는상태
		//본문이 없는 getPay 를만들면됨.
	
}
