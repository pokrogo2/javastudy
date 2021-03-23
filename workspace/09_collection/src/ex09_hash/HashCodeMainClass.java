package ex09_hash;

public class HashCodeMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * 몇몇 아이디가있다.
 * 각각의 해시코드를 몇가지 규칙으로 생성해보자.
 * 1) 첫글자에 따라서 해시코드 정한다.
 * 
 * 
 * apple 	1
 * africa	1
 * avatar	1
 * banana	2
 * bonus	2
 * bravo	2
 *  
 * 2) 글자수에 따라서 해시코드 정한다.
 * 
 * 
 * apple 	5
 * africa	6
 * avatar	6
 * banana	6
 * bonus	5
 * bravo	5
 * 입력된 아이디 검색
 * 검색속도를 높이기위해 hash 개념이 사용됩니다.
 * 
 * 검색예시 )
 * 검색아이디 : april
 * 사용 해시코드 : 글자수
 * 동작
 * april의 해시코드를 구한다.
 * 해시코드는 5
 * 코드가 5인것중에서 찾는다.
 */
	
		Integer a= 10;
		System.out.println(a.hashCode());
		Double b=1.5;
		System.out.println(b.hashCode());
		
		String str ="hello";
		System.out.println(str.hashCode());
	//나름의 해시코드가있다.

	Dog dog= new Dog();
	Cat cat =new Cat();
	System.out.println(dog);
	System.out.printf("%x\n",dog.hashCode()); //object의 해시코드
	System.out.println(cat);
	System.out.printf("%x\n",cat.hashCode());//object의 해시코드
	//object 의 hashcode 는 객체의 메모리 주소를 반환한다.
	
	
	//hashSet 과 HashMap의 공통점은
	//중복이 불가능한 데이터가 있다
	// 어떻게 중복유무를 확인하나
	// hash개념.
	//해시코드가 같아야 다음단계
	//실제로 같은지 equals메소드로비교
	// 그결과가 같으면 중복데이터가 있는것으로 판단함.
	//오버라이드해서 찾는걸 개발해야함.
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// ------------------------------------------------------------------------
	
	}

}

class Dog{}
class Cat{}