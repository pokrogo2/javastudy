package ex01_branch;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 양수 입력받아서 홀,짝,3배수 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력하세요 :");
		int a = sc.nextInt();
		String answer = (a%3==0) ? "3의 배수" : (a%2==0) ? "2의 배수" :"1의 배수";
		System.out.println(answer);
	}

}
