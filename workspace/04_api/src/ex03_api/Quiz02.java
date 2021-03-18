package ex03_api;


import java.util.Calendar;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2.calendar를 활용해서 기념일계산
		//두개의 날짜를 만들고 그중 하나는 기념하고싶은 기념일.
		//두 날짜의 차이를 구하면됨.
		//일 수로 출력
		Calendar cal = Calendar.getInstance();
		
		cal.set(2000,0,1);
		Calendar today = Calendar.getInstance();
		//타임스탬프의 차이를 구합니다.
		long diff = today.getTimeInMillis() - cal.getTimeInMillis();
		long diffday=diff/(1000*60*60*24);
		//ms 이므로 일(1000x60x24)=1일
		System.out.println(diffday);

	}

}
