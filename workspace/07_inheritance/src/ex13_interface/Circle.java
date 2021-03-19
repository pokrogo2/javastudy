package ex13_interface;

public class Circle implements Shape {
	private double radius;
	

	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	public Circle(double radius) {
		super();
		this.radius = radius;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (Math.PI)*Math.pow(radius, 2);
	}

}
