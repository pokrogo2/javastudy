package Quiz11;

import java.util.Scanner;

public class WeekScheduler {

	private int nthWeek;
	private Day[] week;
	private String[] weekNames = {"일","월","화","수","목","금","토"};
	private Scanner sc = new Scanner(System.in);
	//constructor
	
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		week = new Day[7];
		for(int i =0; i<week.length;i++) {
			week[i] = new Day();
		}
		
	}
	public void run() {
		while(true) {
			menu();
			System.out.println("작업 선택");
			int choice = sc.nextInt();
			sc.nextLine();// 엔터한번남은거 처리
			switch (choice) {
			case 1 : makeSchedule();break;
			case 2 : deleteSchedule();break;
			
			case 3 : updateSchedule();break;
			case 4 : searchSchedule();break;
			case 5 : printAllSchedule();break;
			case 0 : exit(); return;
			default : System.out.println("없는작업");
			}
		}
	}
		// TODO Auto-generated method stub
		
	
	public void menu() {
		System.out.println("====스케쥴러=====");
		System.out.println("1 스케쥴 만들기");
		System.out.println("2 스케쥴 삭제하기");
		System.out.println("3 스케쥴 수정하기");
		System.out.println("4 스케쥴 조회하기");
		System.out.println("5 전체 스케쥴 조회하기");
		System.out.println("0 프로그램 종료하기 ");
		System.out.println("==========asdf====");
	}
	//exit
	public void exit() {
		System.out.println("스케쥴러를 종료합니다.");
		sc.close();
	}
	private void makeSchedule() {
		System.out.println("스케쥴 만들기");
		System.out.println("스케쥴을 등록할 요일(일~토) >>");
		String weekName = sc.next();
		sc.nextLine(); //남은 엔터제거
		for(int i = 0; i<week.length;i++) {
			if(weekNames[i].equals(weekName)) {
				if(week[i].getSchedule() ==null ||week[i].getSchedule().isEmpty()) {
					System.out.println(weekName+"요일 신규 스케쥴");
					String schedule = sc.nextLine();
					week[i].setSchedule(schedule);
					System.out.println(weekName+"요일에 신규 스케쥴이 저장되었습니다.");
				}else {
					System.out.println(weekName+"요일에 이미 스케쥴이 있습니다.");
				}
				break;
			}
	}
	
}
	public void deleteSchedule() {
		System.out.println("스케쥴 삭제");
		System.out.println("스케쥴을 삭제할 요일(일 ~ 토)입력 >>>");
		String weekName = sc.next();
		weekName = weekName.substring(0,1);
		sc.nextLine();
		for(int i=0; i<week.length;i++) {
			if(weekNames[i].equals(weekName)) {
				if(week[i].getSchedule()==null ||week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 비어있습니다.");
				}else {
					System.out.println(week[i].getSchedule());
					System.out.println("삭제할까요?");
					String yesNo= sc.next();
					yesNo = yesNo.substring(0,1);
					if(yesNo.equalsIgnoreCase("Y")) {
						week[i].setSchedule(null);
						System.out.println(weekName +"요일이 삭제되었습니다.");
						
					}else {
						System.out.println("삭제취소");
					}
				}
			break;	
			}
		}
	}

	public void updateSchedule() {
		System.out.println("===스케쥴 수정===");
		System.out.print("스케쥴을 수정할 요일(일~토) 입력 >>> ");
		String weekName = sc.next();
		weekName = weekName.substring(0, 1);
		sc.nextLine();
		for (int i = 0; i < week.length; i++) {
			if (weekNames[i].equals(weekName)) {
				if (week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName + "요일은 스케쥴이 없습니다.");
					System.out.print("새로운 스케쥴을 등록하시겠습니까(Y/N)? >>> ");
					String yesNo = sc.next();
					sc.nextLine();
					if (yesNo.charAt(0) == 'Y' || yesNo.charAt(0) == 'y') {
						System.out.print(weekName + "요일의 신규 스케쥴 입력 >>> ");
						String schedule = sc.nextLine();
						week[i].setSchedule(schedule);
						System.out.println(weekName + "요일에 신규 스케쥴이 저장되었습니다.");
					} else {
						System.out.println("스케쥴 수정이 취소되었습니다.");
					}
				} else {
					System.out.println(weekName + "요일의 스케쥴을 확인합니다.");
					System.out.println("[" + week[i].getSchedule() + "]");
					System.out.print("스케쥴을 수정할까요(Y/N)? >>> ");
					String yesNo = sc.next();

				}
			}
	}
	
	
}
	//
	public void searchSchedule() {
		System.out.println("조회");
		System.out.println("스케쥴을 조회할 요일(일~토)입력>>");
		String weekName = sc.next();
		weekName = weekName.substring(0,1);
		for(int i=0; i<week.length; i++) {
			if(weekNames[i].equals(weekName)) {
				week[i].info();
				return;
			}
		}
		System.out.println(weekName+"요일은 존재하지않습니다.");
	}
	//
	public void printAllSchedule() {
		System.out.println(nthWeek +"주차 전체 스케쥴");
		for(int i=0;i<week.length;i++) {
			System.out.println(weekNames[i] + "요일 스케쥴 : ");
			week[i].info();
			
		}
	}
}