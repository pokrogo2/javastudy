package ex10_downcasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Student();
	
		//컴파일 > 실행
		// 코드 > new처리
		
		p1.eat();
		p1.sleep();
		//p1.study(); // person p에서 보고 호출메소드결정하므로 student에있는 study를 불러올수없다.
		//p1을 student타입으로 변경하면 됨.
		
		//1.(Student)p1으로 먼저 캐스팅
		//2. (Studnet)p1.study(): 동작하지않음. why?
		// 연산자 최우선순위가 마침표(.)이기때문
		//((Student)p1).study():캐스팅을먼저하고 study하면됨.
		((Student)p1).study();
		Person p2;
		p2 = new Worker();
		p2.eat();
		p2.sleep();
		((Worker)p2).work();
		
		//실수
		Person p3;
		p3 = new Student();
		p3.eat();
		p3.sleep();
		//((Worker)p3).work();
		//p3가 Student이면 Student로 캐스팅하고
		//p3가 Worker이면 Worker로 캐스팅하라.
		
		if(p3 instanceof Student) {
			((Student)p3).study();
		}else if(p3 instanceof Worker) {
			((Worker)p3).work();
		}
		
	}

}
