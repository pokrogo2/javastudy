package Quiz06;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bakery bakery1 = new Bakery(100,1000,10000); //빵 100, 모든빵 가격 1000,자본 10000
		Bakery bakery2 = new Bakery(50,500,10000);
		
		Customer customer = new Customer(20000); //가진돈 20000
		
		customer.buy(bakery1,10000); //bakery1에서 빵 10개구매 남은돈 10000
		customer.buy(bakery2,10000);// bakery2에서 빵 20개구매 남은돈 0
		

		bakery1.info();//남은빵 90, 20000원있음
		bakery2.info();//빵 30개남음, 자본금 20000
		
		
	}

}
