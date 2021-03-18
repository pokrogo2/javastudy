package Quiz12;

import java.util.Scanner;

public class ConcertHall {

	private String hallName;
	private char[] seatTypes= {'S','R','A','B'};
	private int[] seatCounts = {10,10,10,10};
	private int[] charges = {200000,150000,100000,50000};
	private SeatGroup[] seatGroups;
	private Scanner sc = new Scanner(System.in);
	
	//constructor
	public ConcertHall(String hallName) {
		this.hallName = hallName;
		this.seatGroups = new SeatGroup[seatTypes.length];
		//seatgroup생성
		for(int i=0;i<seatTypes.length;i++) {
			seatGroups[i] = new SeatGroup(seatTypes[i], seatCounts[i], charges[i]);
		}
	}
	public void run() {
		while(true) {
			menu();
			System.out.println("작업 선택 : ");
			int choice =sc.nextInt();
			switch(choice) {
			case 1 : reservation(); break;
			case 2 : cancel();break;
			case 3 : inquiry();break;
			case 4 : info();break;
			case 0 : exit();return;
			default : System.out.println("잘못된입력");
			}
		}
	}
	public void menu() {
		System.out.println("예매 프로그램");
		System.out.println("1. 예매");
		System.out.println("2.예매 취소");
		System.out.println("3.예매 조회");
		System.out.println("4.예매 현황");
		System.out.println("0.종료 ");
		
	}
	public void reservation() {
		System.out.println("예매할 좌석 타입(S,R,A,B) : ");
		char seatType = sc.next().charAt(0);
		for(int i=0;i<seatTypes.length;i++) {
			if(seatType ==seatTypes[i]) {
				seatGroups[i].reservation();
			}
		}
	}
	public void cancel() {
		System.out.println("예매취소할 좌석 타입(S,R,A,B) : ");
		char seatType = sc.next().charAt(0);
		for(int i=0;i<seatTypes.length;i++) {
			if(seatType ==seatTypes[i]) {
				seatGroups[i].cancel();
			}
		}
	}
	public void inquiry() {
		System.out.println("조회할 사용자 이름 입력 >>>");
		String name =sc.next();
		for(int i = 0; i< seatGroups.length; i++) {
			SeatGroup seatGroup = seatGroups[i];
			Seat[] seats = seatGroup.getSeats();
			for(int j = 0; j<seatGroups[i].getSeats().length;j++) {
				if(name.equals(seats[j].getName())) {
					System.out.println(seatTypes[i] + " : " +(j+1)+"번 좌석이 " + name+"님에게 예약되어 있습니다.");
					return;
				}
			}
			System.out.println(name + " 님의 정보가 없습니다.");
		}
	}
	public void info() {
		System.out.println("예매총액"+getTotalCharge());
		for(SeatGroup seatGroup : seatGroups) {
			seatGroup.info();
			System.out.println();
		}
	}
	public int getTotalCharge() {
		int total=0;
		for(SeatGroup seatGroup : seatGroups) {
			total += seatGroup.getTotalCharge();
		}return total;
	}
	public void exit() {
		System.out.println(hallName + "종료");
	}
}
