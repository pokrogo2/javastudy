package ex04_finally;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a= 0;
		try {
		System.out.println();

		System.out.println("정수를 입력하세요");
		a=sc.nextInt();
		System.out.println("입력은 " + a + "입니다.");
		
		}catch(Exception e) {
			System.out.println("예외 발생");
				
		}finally {//단한번, 무조건 실행되는 영역
			System.out.println("종료");
			sc.close();
		}
	}

}
