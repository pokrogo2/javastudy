package ex05_throw;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		//예외를 직접 발생시키는 경우throw  를 이요
		try {
			throw new NumberFormatException();
		}catch(Exception e) {
			System.out.println("예외가 발생했습니다 : " +e);
		}*/
		
		Calculator cal = new Calculator();
		try {
			cal.divison(0);
		}catch(Exception e) {
			System.out.println(" 예외발생 " + e);
		}

	}

}
