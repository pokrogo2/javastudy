package ex06_override;

public class Coffee {

	//field
	private String bean;
	//constructor
	public Coffee(String bean) {
		this.bean=bean;
	}
	public void taste() {
		System.out.println(bean+"원산지 원두는 맛이 없다.");
	}
}
