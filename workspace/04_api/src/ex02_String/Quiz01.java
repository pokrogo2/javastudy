package ex02_String;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//시간 입력받아서 출력하기
		//시간 >>>9
		//분 >>>5
		//초>>>30
		//9 : 05 : 30
		
		Scanner sc = new Scanner(System.in);
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		System.out.println("시간 >>>");
		hour = sc.nextInt();
		
		System.out.println("분 >>>");
		min = sc.nextInt();
		System.out.println("초 >>>");
		sec = sc.nextInt();
		
		String strHour =hour+"";
		String strMin =min+"";
		String strSec =sec+"";
		
		if(strMin.length()==1) {//한글자면
			strMin = "0"+strMin;
			
		}
		if(strSec.length()==1) {//한글자면
			strSec = "0"+strSec;
			
		}
		
	}

}
