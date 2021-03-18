package Quiz01;

import java.sql.Date;
import java.util.Calendar;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book b1 = new Book();
		
		b1.title ="어린왕자";
		b1.author = "생택쥐베리";
		b1.bestsell=true;
		b1.page = 500;
		b1.remain = 100;
		Calendar date = Calendar.getInstance();
		date.set(2000,0,10);
		long timestamp = date.getTimeInMillis();
		b1.pubDate = new Date(timestamp);
		
		System.out.println("책이름 : " + b1.title + " 저자 : " + b1.author + " 베스트셀러 : " + b1.bestsell + " 페이지수 : " + b1.page+" 남은재고 : " + b1.remain +"발매일 : " + b1.pubDate);
		
		
	}

}
