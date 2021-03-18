package ex01_branch;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch, 단계를 숫자로 입력받아 구분하여 출력
		//1 입력 기승전결 2입력 승전결 3입력 전결 4입력 결 나머지 입력 알수없음
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("기");
		case 2:
			System.out.println("승");
		case 3:
			System.out.println("전");
		case 4:
			System.out.println("결");
			break;
		default:
			System.out.println("알수없음");


		}
	}

}
