package ex17_Object.ex03;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog dog = new Dog();
		
		dog.setAge(5);
	
		dog.setName("댕댕이");
		
		System.out.println(dog.getAge());
		System.out.println(dog.getName());
	//lombokㅇ로 추가한 toString()
		System.out.println(dog);
	}

}
