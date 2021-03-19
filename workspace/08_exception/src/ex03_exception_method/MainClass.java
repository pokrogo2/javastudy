package ex03_exception_method;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=2/0;
			Integer.parseInt("1.5");
		}catch(NumberFormatException e) {
			System.out.println("예외 메세지 : " + e.getMessage());
			e.printStackTrace();//개발자를 위한 코드
		}

	}

}
