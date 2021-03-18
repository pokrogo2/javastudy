package ex02_method;

public class Person {

	/*
	 메소드
	 구성
	 	1)결과타입
	 	2)메소드명
	 	3)매개변수
	 정의
	 	결과타입 메소드명(매개변수){
	 		메소드 본문
	 		}
	 		
	 */
	String name;
	int age;
	char gender;
	boolean isKorean;
	double height;
	double weight;
	
	//method (필드를 사용할수 있는 함수)
	//1.결과타입 : 없다(void)
	//2.메소드명 : set
	//3.매개변수 : String n, int a,char g, boolean isk
	//4.역할 : 전달되는 인수로 필드 값을 저장합니다.
	
	void set(String n,int a,char g, boolean isk,double h,double w) {
		name=n;
		age=a;
		gender =g;
		isKorean=isk;
		height=h;
		weight=w;
	}
	//결과 타입 : 결과값이 없다.void
	//메소드명 : info
	// 매개변수 : 전달되는 인수가 없다.
	// 역할 : 객체의 필드값을 출력해 줍니다.
	void info() {
		System.out.println("이름" + name);
		System.out.println("나이"+age);
		System.out.println("성별"+gender);
		System.out.println(isKorean ? "한국인" : "외국인");
		System.out.println("키는 : " +height);
		System.out.println("몸무게는 : " +weight);
	}
	// 결과 타입 :  결과값의 타입이 double
	// 메소드 명 : getBMI
	// 매개변수 : 없음
	// 역할 : 객체의 체질량 지수를 결과로 반환한다
	
	double getBMI(){
		double bmi= weight/Math.pow(height/100, 2);
		return bmi;
	}
	
	
	
}
