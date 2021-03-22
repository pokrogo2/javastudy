package ex17_Object.ex02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog= new Dog("댕댕이");
		System.out.println(dog);
		System.out.println(dog.toString());//위아래 같은코드임.
		
		//object클래스의 toString()
		/*
		 public String toString(){
		 	return getClass().getName()+"@"+hashCode(); 클래스 @ 메모리참조
		  */

	}

}
