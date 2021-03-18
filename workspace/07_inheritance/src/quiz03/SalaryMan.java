package quiz03;

public class SalaryMan extends Staff{
	
	private int salary;

	public SalaryMan(String name, int salary) {
		super(name);
		this.salary = salary;
	}
	public int getPay() {
		return salary;
	}
	@Override
	public void info() {
		super.info();
		System.out.println("페이 : "+ salary);
	}

}
