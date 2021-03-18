package ex01_is_a;

public class MainClass {
	public static void main(String[] args) {
		//student가 eat() 사용하고싶은데.
		//상속
		/*
		 어떤 클래스가 다른 클래스의 기능을 확장
		 상속이 가능한 대표적인 클래스의 관계는 is - a 관계이다.
		 IS -A
		 person is a Student 사람은 학생이다. x
		 Student is a Person. 학생은 사람이다 o
		 student 는 person의 기능을 (메소드) 확장할 수 있습니다.
		 
		 슈퍼클래스  : 서브클래스
		 1. 슈퍼클래스 : 부모클래스 라고도 함. 메소드를 다른 클래스에게 제공하는 클래스다.
		 2. 서브클래스 : 자식클래스 라고함. 슈퍼클래스의 메소드를 제공받음.
		 
		3. 형식 
		class 슈퍼클래스 { }
		class 서브클래스 extends 슈퍼클래스 { }
		 */
		
		Person p = new Person();
		p.eat();
		
		Student s = new Student();
		s.study();
		s.eat();
	}

}
