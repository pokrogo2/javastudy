package ex03_input;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. int 타입의 정수를 3개 입력받아서 평균 구하기.
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a+b+c)/3.0);
		
		

	}

}
