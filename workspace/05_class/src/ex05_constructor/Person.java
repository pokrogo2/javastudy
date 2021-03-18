package ex05_constructor;

/*
 	생성자 (constructor)
 	1.객체를 생성하는 메소드입니다.
 	2.특징
 		1)결과타입 : 존재하지않음.
 		2)메소드명 : 클래스 명과 같습니다.
 		3)매개변수 : 일반 메소드와 같습니다.
 	3.호출시점
 		: 객체를 생성하기위해서 new를 호출하면 그 때 호출됩니다.
 */
/*
 	객체 생성									생성자
 	Person p =new Person("james");			Person(String name){...} //
 	Person p =new Person("ali",20)			Person(String name,int age){...}
 	Person p =new Person()					Person(){...}
 
 
 */
public class Person {
	String name;
	int age;
	char gender;
	
	Person(String name,int age,char gender){
		this.name=name;
		this.age =age;
		this.gender=gender;
		
	}
	Person(String name){
		this(name,0,'\0'); // this()는 생성자들을 의미
		
	}
	Person(String name,int age){
		this(name,age,'\0');
	}
	Person(){
		this(null,0,'\0');
	}

}
