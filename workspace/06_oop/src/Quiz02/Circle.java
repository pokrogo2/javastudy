package Quiz02;

public class Circle {

	private Coord center;
	private double radius;
	public Circle(Coord center,double r){
		this.center =center;
		this.radius=r;
	}
	public Circle(int x,int y,double r){
		this.center =new Coord(x,y);
		this.radius=r;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
		
	}
	public void info() {
		System.out.print("중심좌표 : ");
		center.info();
		System.out.println(",반지름 : " + radius + " 넓이 : " + getArea());
	}
	
}
