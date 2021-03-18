package quiz03;

public class Staff {


	private String name;

	public Staff(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void info() {
		System.out.println("직원명 : " + name);
	}
	
}
