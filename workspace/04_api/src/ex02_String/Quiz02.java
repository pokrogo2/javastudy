package ex02_String;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수 실수 판별하기
		//입력 >>> 120
		//정수입니다.
		// 12 . 2
		//실수입니다.
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요 : ");
		String input =sc.next();
		
		if(input.indexOf(".")==-1) {
			System.out.println("정수입니다.");
		}
		else {
			System.out.println("실수입니다.");
		}
		
		
	}

}
