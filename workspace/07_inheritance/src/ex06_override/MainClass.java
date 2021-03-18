package ex06_override;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coffee coffee = new Coffee("콜롬비아");
		coffee.taste();
		Espresso espresso = new Espresso("인도네시아" , 10);
		espresso.taste();
	}

}
