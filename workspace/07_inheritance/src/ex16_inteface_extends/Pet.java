package ex16_inteface_extends;

public class Pet {

	private String name;

	public Pet(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feed(String food) {
		System.out.println(name + "is eating" + food);
	}
	
}
