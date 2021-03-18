package ex03_has_a;

public class MainClass {
	//has a 관계도 상속처리가능
	//circle has a coord(원은 자표를 가지고있다.)
	//coord를 슈퍼클래스로 지정,circle을 서브

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ㅓ브인 circle 클래스가 정삭적으로 생성되는지 확인
		Circle c= new Circle();
		c.setCircle(1,1,1.5);
		c.CircleInfo();

	}

}
