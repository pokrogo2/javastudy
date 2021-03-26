package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

//FileWriter 클래스
// 문자기반 + 출력스트림
// 문자를 보낼때 사용
// 1. 통신 : 상대한테 보낼때
// 2. 파일 : 텍스트 파일을 만들때
// 출력 메소드
// write()
//출력 단위
//char[] , String, int
//예외 처리가 필요합니다.
public class FileWriterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw =null;

		
		try {
			fw = new FileWriter("text1.txt");//파일을 만드는것
			char[] cbuf = {'H','E','L','L','O'};
			String str ="java ";
			int ch = '!'; // int4바이트 char2바이트라 들어갈수있음.
			String str2 ="\n nice to meet you!";
			//text1.txt파일로전송
			fw.write(cbuf);
			fw.write(str);
			fw.write(ch);
			fw.write(str2);
			System.out.println("text1.txt 파일이 생성되었습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(fw!=null) {fw.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
