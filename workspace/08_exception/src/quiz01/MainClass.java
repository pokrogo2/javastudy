package quiz01;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//계산기만들고 4가지 연산을 모두 수행
		try {
		Calculator cal =new Calculator();
		cal.add(10);
		cal.sub(5);
		cal.mul(2);
		cal.divison(0);
	
		}catch(ArithmeticException e) {
			System.out.println("예외발생");
		}
	}

}
