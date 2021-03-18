package ex09_upcasting;

public class Latte extends Espresso{

	private int milk;

	public Latte(String bean, int water, int milk) {
		super(bean, water);
		this.milk = milk;
	}
	@Override
	public void info() {
		super.info();
		System.out.println("우유"+ milk +"ml");
	}
}
