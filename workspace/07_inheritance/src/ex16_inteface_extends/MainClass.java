package ex16_inteface_extends;

public class MainClass {
	public static void main(String[] args) {
		
	
	Dog dog =new Dog("댕댕이");
	Snake snake = new Snake("뱜");
	
	Person person = new Person();
	
	
	person.feed(dog,"닭고기");
	person.feed(snake, "소고기");
	
	person.walking(dog);
	//person.walking(snake);

}
}