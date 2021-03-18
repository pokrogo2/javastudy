package ex01_branch;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//switch사용, 나이 입력 받아서 성인 미성년자
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		int a = age>=20 ? 1:2;
		
		switch(a) {
		case 1:
			System.out.println("성인입니다.");
			break;
		case 2:
			System.out.println("미성년자입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}

}
