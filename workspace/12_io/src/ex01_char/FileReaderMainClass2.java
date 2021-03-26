package ex01_char;

import java.io.FileReader;

public class FileReaderMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileReader fr = new FileReader("text3.txt")) {
			
			
			while(true) {
				char[] cbuf =new char[5];
				int readCharCount = fr.read(cbuf);// 읽은 내용은 cbuf에. charcount는 글자수가 저장
				System.out.println(readCharCount);
				if(readCharCount ==-1) {
					break;
				}
				System.out.println(cbuf);
				//파일의 끝에 도달하면 -1을 readCharCount에 반환.
				//cbuf :안녕하세요
				//cbuf : \n반갑
				//cbuf :습니다.갑
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
