package ex02_loop;

public class Ex04_nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int out = 1; out<=10; out++) {
			for(int in = 10; in<=50;in+=10) {
				System.out.println(out + " , " + in);
			}
		}*/
		//주차 1일차 1교시
		//1주차 1일차 2교시
		// 총 3주차 총 5일 총 8교시
		for(int week=1; week<=3; week++) {
			for(int day=1; day<=5; day++) {
				for(int time=1; time<=8; time++) {
					System.out.println(week + "주차 " + day + "일차 " +time+"교시 입니다.");
				}
					
			}
		}
	}

}
