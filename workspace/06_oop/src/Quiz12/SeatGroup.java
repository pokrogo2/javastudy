package Quiz12;

import java.util.Scanner;

public class SeatGroup {

	private char seatType; // S R A B
	private int charge; //  요금
	private Seat[] seats;
	private Scanner sc= new Scanner(System.in);
	
	// constructor
	public SeatGroup(char seatType,int seatCount, int charge) {
		this.seatType =seatType;
		this.charge = charge;
		this.seats = new Seat[seatCount]; //배열만 만든것. 
		// 배열에 실제 Seat를 생성하는 작업
		
		for(int i = 0;i<seats.length;i++) {
			seats[i] = new Seat();//빈좌석 생성.
		}
	}
	//method
	// 예약
		//결과타입 :boolean (true,false)
		//메소드명 : reservation
		//매개변수 : 없다
	public boolean reservation() {
		System.out.println("좌석 번호를 입력하세요 : ");
		int seatNo = sc.nextInt();
		//사용자가 예매하려면 시트는 seats[seatNo-1]
		//1예매 번호확인
		if(seatNo<1||seatNo>seats.length) {
			System.out.println(seatNo+"은 없는 자석입니다. 다시시도하세요");
			return false;
		}
		if(seats[seatNo-1].check()) {
			System.out.println("이름을 입력하세요 : ");
			String name=sc.next();
			
			seats[seatNo-1].setName(name);
			System.out.println(seatNo+"번 좌석이" + name+"님에게 예약되었습니다. 감사합니다.");
			return true;
			
		}else {
			System.out.println("이미 예약된좌석입니다. 다시시도해주세요");
			return false;
		}
	}
	//예매 취소
	public boolean cancel() {
		System.out.println("예매 취소자의 이름을 입력하세요 >>>");
		String name = sc.next();
		for(int i =0; i<seats.length;i++) {
			if(seats[i].getName() !=null && seats[i].getName().equals(name)) {
				System.out.println("예매를 취소하겠습니까? : Y/N");
				String yn = sc.next();
				yn = yn.charAt(0) + "";
				if(yn.equalsIgnoreCase("y")) {
					seats[i].cancel();
					System.out.println("예매가 취소되었습니다.");
					return true;
				}else {
					System.out.println("예매취소가 취소되었습니다.");
					return false;
				}
			}
		}System.out.println(name + "이름의 예약자가 없습니다.");
		return false;
	}
	//예매현황
	public void info() {
		System.out.println(seatType + " : ");
		for(int i = 0; i<seats.length;i++) {
			seats[i].info();
			System.out.print(" ");
		}
	}
	public int getTotalCharge() {
		int total =0;
		for(Seat seat : seats) {
			if(!seat.check()) {
				total+=charge;
			}
		}
		return total;
	}
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
}
