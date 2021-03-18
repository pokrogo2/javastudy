package ex05_access;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//클래스에 생성자가 없는 경우
		//디폴트 생성자가 자동

		//public Person() { }
		Person p = new Person();
		
		p.setName("david");
		p.setAge(25);
		p.setKorean(false);
		System.out.println("이름 : " + p.getName());
		System.out.println("나이 : " + p.getAge());
		System.out.println("한국인 : " +( p.getKorean()? "한국인" : "외국인"));
	}

}
