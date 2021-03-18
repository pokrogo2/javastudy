package ex03_api;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Ex05_SimpleDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//년 :yy/yyyy
		//월 : M/MM
		//일 : d,dd
		//요일 : E(일~토)
		//오전오후 : a (오전/오후)
		//시간 : h,hh
		//		H,HH
		// 분 : m,mm
		//초 : s,ss
		Date date = new Date(System.currentTimeMillis());
		String pattern = "yyyy-MM-dd a h : mm";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("pattern : "+sdf.format(date));
		System.out.println(date);

	}

}
