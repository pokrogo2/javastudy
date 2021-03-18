package ex03_has_a;

public class Circle extends Coord{
private double radius;
public void setCircle(int x,int y,double radius) {
	//coord 클래스의 set 메소는 x y 값을 지정하는 메스드
	//circle 클래스는 coord클래스를 상속받아 모든 메소드를 자기거처럼 사용가능
	set(x,y);
	this.radius = radius;
	
}
public void CircleInfo() {
	System.out.println("중심좌표 : ");
	info();
}
	
}
