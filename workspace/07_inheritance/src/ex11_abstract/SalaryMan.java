package ex11_abstract;

public class SalaryMan extends Staff{

	private int salary;

	public SalaryMan(String name,int salary) {
		super(name);
		this.salary = salary;
	}
	
	@Override
	public void info() {
		super.info();
		System.out.println("기본급 : " + salary);
	}
	//필수
	@Override
	public int getPay() {
		return salary;
	}
}
