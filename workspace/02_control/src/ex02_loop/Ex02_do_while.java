package ex02_loop;

import java.util.Scanner;

public class Ex02_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//do - while
		//반드시 한번 실행하는 while문
		
		Scanner sc = new Scanner(System.in);
		int total =0;
		int n = 0;
		
		do {
			System.out.print("양수만 입력 : ");
			n= sc.nextInt();
			total += n;
			
		}while(n>=0);
		total -=n;
		System.out.println(total);
	}

}
