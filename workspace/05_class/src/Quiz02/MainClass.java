package Quiz02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c =new Calculator();
		//calculator c 는 참조변수 c를선언. c= new calculator()는 객체를 만든것
		//인스턴스 화 라고함.
		
		c.add(1, 2);
		int a=5;
		int b=40;
		
		if(a>=b) {
			System.out.println(c.sub(a, b));
		}else {
			System.out.println(c.sub(a, b));
		}

	}

}
