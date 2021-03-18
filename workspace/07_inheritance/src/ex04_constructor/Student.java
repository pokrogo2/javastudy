package ex04_constructor;
//서브클래스
//부모가 먼저 태어나야 자식도 태어날수잇음
//서브 클래스의 생성자는 슈퍼클래스의 생성자를 "반드시" 먼저 호출해야한다.
//생략이 가능한 경우는 슈퍼클래스의 생성자가 디폴트생성자 형태일때 입니다.
//super : 슈퍼클래스의 참조값
//1.super.멤버 : super.필드/super.메소드()
public class Student extends Person{

	private String school;
	public Student(String name,String school) {
		super(name);
		this.school=school;
	}
	public void info() {
		System.out.println("학교" + school);
		System.out.println("이름 :"+ getName());
		
	}
	
}
