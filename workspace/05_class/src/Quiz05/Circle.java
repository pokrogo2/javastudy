package Quiz05;

public class Circle {

	
	double radius;
	
	void setRadius(double radius) {
		this.radius=radius;
		
	}
	double getCircum() {
		return 2*Math.PI*radius;
		
	}
	double getArea() {
		return Math.PI*radius*radius;
	}
}
