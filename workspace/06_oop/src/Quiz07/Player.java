package Quiz07;

import java.util.Scanner;

public class Player {
	//필드
	private String name;
	private Scanner sc = new Scanner(System.in);
	//생성자
	public Player(String name) {
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int play() {
		System.out.println(name + "'s game start");
		System.out.println("Press Enter");
		sc.nextLine();
		long start = System.currentTimeMillis();
		System.out.println("10초 뒤 enter");
		sc.nextLine();
		long end = System.currentTimeMillis();
		
		return (int)((end-start)/1000);
		//엔터 입력 메소드 : nextLine <줄바꿈
	}
}
