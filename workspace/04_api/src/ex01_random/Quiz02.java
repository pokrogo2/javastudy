package ex01_random;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~10000사이 난수 발생하면 사용자가 해당 난수를 맞추는 게임
		//입력 5000
		// UP
		//입력 6000 >>down
		//

		
		Scanner sc = new Scanner(System.in);
		int cor = (int)(Math.random()*10000)+1;
		int n=0; // 사용자 입력값
		int count=0;

		int top =10000;
		int bottom = 0;
		while(true){
			System.out.println(cor);
			System.out.println(bottom+"~"+top+"사이의 수를 입력하세요 : ");
			n=sc.nextInt();
			if(n>top || n<bottom) {
				System.out.println(bottom+"~"+top+"범위를 입력하세요");
				continue;
			}
		if(n==cor) {
			System.out.println("정답");
			break;
		}
		else if(n>cor) {
			System.out.println("down");
			top=n-1;
		}
		else {
			System.out.println("up");
			bottom=n+1;
		}
		count++;
		}
		System.out.println("총" + count +"만에 맞추셨습니다.");
	}

}
