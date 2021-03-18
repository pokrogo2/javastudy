package ex03_input;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//성별을 의미하는 숫자(1~4)를 입력받아서ㅏ "남" "여"구분

		Scanner sc =new Scanner(System.in);
		System.out.println("주민번호 뒷자리의 첫자리를 입력하세요 : ");
		int a = sc.nextInt();
		String gender = (a ==1||a==3) ? "남" : "여";
		System.out.println("성별은 : " + gender + "입니다.");
	}

}
