package ex01_random;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보> 가위
		// 플레이어 가위, 컴 보 이겼습니다
		//가위바위보 >> 보
		//플레이어는 보,컴 보
		//플레이어 보 , 컴 가위
		//졌습니다. 1승 1무입니다.
		Scanner sc = new Scanner(System.in);
		String [] gabo = {"가위","바위","보"};
		
		int mu =0;
		int win =0;
		while(true) {
			int c = (int)(Math.random()*3);
			
			System.out.println("가위 바위 보 : ");
			int player =0;//가위
			switch(sc.next()) {
			case "바위":
				player=1;
				break;
			case "보":
				player=2;
				break;
			}
			System.out.println("player는 " +gabo[player]);
			System.out.println(gabo[c]);
			
			//player 0 1 2 
			//player 0 1 2
			//diff = player -com
			//이기면 -2 1 
			//질때 2 -1 
		
			int diff = player-c;
		
			if(c==player) {
				
				System.out.println("무승부입니다.");
				mu++;
			}else if(diff==-2||diff==1) {
				System.out.println("이겼습니다.");
				win++;
			}else {
				System.out.println("졌워");
				break;
			}
		}
		System.out.println(win+"번 이기고 "+mu+"번 비겼습니다.");
		

	}

}
