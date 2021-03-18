package ex02_loop;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//영화 평점 입력받아서 ★을 출력하세요.
		//평점은 1~5 정수,잘못된 평점은 다시 입력처리해주세요.
		
		Scanner sc=  new Scanner(System.in);
		int score;
		do {
			
		
		System.out.println("평점을 입력하세요 : ");
		score = sc.nextInt();


	}while(!(score>=1&&score<=5));
		
		for(int n =0; n<score; n++) {
			System.out.print("★");	}
	}
}
