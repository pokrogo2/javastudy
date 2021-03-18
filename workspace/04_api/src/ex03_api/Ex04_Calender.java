package ex03_api;

import java.sql.Date;
import java.util.Calendar;

public class Ex04_Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.util.calendar
		//시간을 처리하는 주요클래스
		// 미리 정해진 필드를 이용하여 단위를 추출
		Calendar date = Calendar.getInstance();
		String[] d = {"","일요일","월요일","화요일","수요일","목요일","금요일","토요일"};

		
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1; // calendar.month 0~11까지
		int day = date.get(Calendar.DAY_OF_MONTH);
		int weekNo = date.get(Calendar.DAY_OF_WEEK);
		int ampm = date.get(Calendar.AM_PM);
		int hour = date.get(Calendar.HOUR);//0~11
		int hour2 =date.get(Calendar.HOUR_OF_DAY);//0~23
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millis = date.get(Calendar.MILLISECOND);
		System.out.println(year + "-" + month + "-"+day);
		System.out.println((ampm==0? "오전" : "오후") + " " + hour + ":" + minute + ":" + second);
		System.out.println(d[weekNo]);
		//날짜 변경하기
		
		date.set(1990, 10, 10, 9,30, 40); // 1990 11 10/ 9: 30: 40
		System.out.println(date);
		
		//calendar를 이용하여 time스탬프
		long timestamp = date.getTimeInMillis();
		System.out.println(timestamp);
	

		Date date2 = new Date(timestamp);
		System.out.println(date2);
		
		Calendar date3 = Calendar.getInstance();
		date3.setTime(date2);
		System.out.println(date3);
	
	}

}
