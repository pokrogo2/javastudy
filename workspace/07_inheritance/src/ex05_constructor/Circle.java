package ex05_constructor;

public class Circle extends Coord{

	private double radius;
	
	public Circle(int x, int y, int radius) {

		super(x,y);
		this.radius=radius;
		
	}
	public void info() {
		System.out.println("중심좌표는 " +getX() + ","+getY()+"이다");
		System.out.println("반지름은 " +radius);
	}
}
