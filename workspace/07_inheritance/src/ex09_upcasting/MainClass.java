package ex09_upcasting;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Espresso espresso =new Espresso("콜롬비아",30);
		Latte latte =new Latte("인도네시아",30,150);
		espresso.info();
		espresso.taste();
		latte.info();
		latte.taste();
		Coffee coffee1 = new Espresso("콜롬비아", 30);
		Coffee coffee2 = new Latte("인도네시아", 30,150);
		coffee1.info();
		coffee1.taste();
		coffee2.info();
		coffee2.taste();
	}

}
