package quiz03;

public class Alba extends Staff{

	private int payPerHour;
	private int times;
	public Alba(String name) {
		super(name);

	}
	public int getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(int payPerHour) {
		this.payPerHour = payPerHour;
	}
	public int getTimes() {
		return times;
	}
	public void setTimes(int times) {
		this.times = times;
	}
	
	public int getPay() {
		return times*payPerHour;
	}
	@Override
	public void info() {
		super.info();
		System.out.println("페이 : " + getPay());
	}
	
}
