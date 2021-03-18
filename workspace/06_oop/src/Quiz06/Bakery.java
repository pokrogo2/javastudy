package Quiz06;

public class Bakery {
	public int breadCount;
	public int breadPrice;
	public int bakeryMoney;
	

	public Bakery(int bc, int bp, int bm) {
		// TODO Auto-generated constructor stub
		this.breadCount = bc;
		this.breadPrice=bp;
		this.bakeryMoney=bm;
		
	}

	//판매 매소드
	// sell, 결과 BreadAndChage
	// 매개변수 : int money
	public BreadAndChage sell(int money) {
		//고객에게 돌려줄 빵과잔돈
		int sellbread = money/breadPrice;//판매빵갯수
		int change =money%breadPrice;
		BreadAndChage bnc = new BreadAndChage(sellbread, change);
		//잔돈
		bakeryMoney+=(money-change);
		breadCount -=(sellbread);
		return bnc;
	}

	public void info() {
		System.out.println("남은빵 : " + breadCount);
		// TODO Auto-generated method stub
		
	}
	
	

}
