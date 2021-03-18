package ex02_method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p = new Person();
		p.set("ABC",30,'여',false, 170, 50); //인수 4개
		p.info();
		double bmi = p.getBMI();
		System.out.println(bmi);
		
	}

}
