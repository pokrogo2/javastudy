package ex03_input;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 타입 매출액+ 등급("VIP","일반") 입력받아서  실 매출액 출력하기
		//vip는 20%할인, 일반은 5%할인
		Scanner sc = new Scanner(System.in);
		System.out.println("금액과 등급을 입력하세요 :");
		int p = sc.nextInt();
		String s = sc.next();
		double lp = (s.equalsIgnoreCase("VIP")) ? p*0.8 : p*0.95;
		
		System.out.println("실 매출액은 " + lp+"입니다.");
		//_들어간것 snake 

	}

}
