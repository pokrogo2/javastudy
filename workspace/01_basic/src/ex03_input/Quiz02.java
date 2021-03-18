package ex03_input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//double 타입의 실수 2개 입력받아 값 교환하기
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 두개를 입력하세요 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double t;
		t=a;
		a=b;
		b=t;
		System.out.println("a 는 " + a);
		System.out.println("b 는 " + b);
	}

}
