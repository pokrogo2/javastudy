package ex01_generic;

public class Fruit {

	private String name;
	private int price;
	public Fruit(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", price=" + price + "]";
	}
	
	
}
