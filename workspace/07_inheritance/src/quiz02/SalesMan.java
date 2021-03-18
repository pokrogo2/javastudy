package quiz02;

public class SalesMan extends SalaryMan{
	private int salesAmount;//판매실적
	private double incentive; //인센티브
	//판매실적은 입력을 받는게 나으니 생성자에서 넣지않음
	//인센티브는 판매실적따라 바뀜
	public SalesMan(String name, int salary) {
		super(name, salary);
		// TODO Auto-generated constructor stub
	}
	public int getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(int salesAmount) {
		this.salesAmount = salesAmount;
		if(salesAmount>=1000) {
			setIncentive(0.07);
		}else {
			setIncentive(0.05);
		}
	}
	public double getIncentive() {
		return incentive;
	}
	public void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	@Override
	public int getPay() {
		return super.getPay() + getSalePay();
	}
	public int getSalePay() {
		return (int)(salesAmount *incentive);
	}
	public void info() {
		super.info();
		System.out.println("페이 : " + getPay());
		System.out.println("수당 : " + getSalePay());
	}
	

	
}
