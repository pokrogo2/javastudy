package ex03_api;

import java.sql.Date;

public class Ex03_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//java.sql.date
		//db의 date타입에 맞게끔 wrapping처리한 클래스
		long date =System.currentTimeMillis();
		Date today = new Date(date);

		System.out.println(today);
	}

}
