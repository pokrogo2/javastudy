package ex02_loop;

import java.util.Scanner;

public class Qiuz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.퀴즈
		// 대한민국 수도는? 서울 or seoul
		//정답입니다.
		//대한민국의 수도는? >>
		Scanner sc = new Scanner(System.in);
		String b = "서울";
		String c = "seoul";
		
		while(true) {
			

			System.out.println("대한민국의 수도는 ? : ");
			String a= sc.nextLine();
			if(a.equals(b) || a.equals(c)) {
				System.out.println("정답입니다.");
				break;
			}
			else {
				System.out.println("오답입니다.");
			}
			
		}
	}

}
