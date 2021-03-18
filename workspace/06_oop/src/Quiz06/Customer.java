package Quiz06;

public class Customer {
	private int customerBread;
	private int customerMoney;
	

	public Customer(int cM) {
		// TODO Auto-generated constructor stub
		this.customerMoney=cM;
	}

	public void buy(Bakery bakery, int money) {
		BreadAndChage bnc = bakery.sell(money);
		
		customerBread+=(bnc.getBread());
		customerMoney+=(bnc.getChange());
		customerMoney-=money;
		
		System.out.println(bakery + "에서 빵"+customerBread+"개 구매");
		
		

		
		// TODO Auto-generated method stub
		
	}

}
