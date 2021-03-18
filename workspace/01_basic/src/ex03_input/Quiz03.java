package ex03_input;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//나이를 입력받아서 성인,미성년자 구분하기.
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		String t = age>=20 ? "성인" : "미성년자";
		System.out.println(t);
	}

}
