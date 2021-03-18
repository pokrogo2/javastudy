package ex03_overloading;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//직사각형
		Rectangle rect =new Rectangle();
		rect.set(-3,-4);
		System.out.println("넓이 : " +rect.getArea());
		
		//정사각형만들기
		Rectangle rect2 = new Rectangle();
		
		rect2.set(-3);
		System.out.println("넓이 : " +rect2.getArea());
	}

}
