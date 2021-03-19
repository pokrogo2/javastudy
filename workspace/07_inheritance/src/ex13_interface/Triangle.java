package ex13_interface;

public class Triangle implements Shape {

	private int width;
	private int height;
	
	
	
	public Triangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*height*0.5;
	}

}
