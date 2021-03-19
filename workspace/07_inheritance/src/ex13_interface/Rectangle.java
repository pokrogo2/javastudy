package ex13_interface;

//인터페이스는 본문이 없는 추상메소드만 가지고있다.
//해당 추상메소드를 반드시 오버라이드해야함.

//클래스를 상속받을때는 extends를 사용하고
//인터페이스를 구현 할때는 implements를 사용합니다.
public class Rectangle implements Shape{

	private int width;
	private int height;
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	@Override
	public double getArea() {
		return width*height;
		
	}
}
