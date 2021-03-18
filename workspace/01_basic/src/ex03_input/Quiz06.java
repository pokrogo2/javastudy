package ex03_input;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//주민번호 하이픈없이 전체 입력받아서 남,여 구분출력하기
		Scanner sc =new Scanner(System.in);
		System.out.println("주민번호 뒷자리를 입력하세요 : ");


		//'1' %2 ==> 49/2 =1로 계산됨
		//'0'= 48
		//'A'=65
		//'a'=97
		String id = sc.next();
		char genderNum = id.charAt(6);
		String gender = (genderNum =='1'||genderNum=='3') ? "남" : "여";
		System.out.println("성별은 : " + gender + "입니다.");
	}

}
