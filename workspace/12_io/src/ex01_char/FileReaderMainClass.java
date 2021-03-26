package ex01_char;
//FileWriter 클래스
//문자기반 + 입력스트림
//문자를 읽을때 사용
//1. 통신 : 상대한테 받을때
//2. 파일 : 텍스트 파일을 읽을때
//출력 메소드
//read()
//입력 단위
//char[] ,int
//예외 처리가 필요합니다.
import java.io.FileReader;
import java.io.IOException;

public class FileReaderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try(FileReader fr = new FileReader("text1.txt")){
			/*while(true) {
				int ch =fr.read(); // 읽은 문자 또는 -1
				if(ch==-1) {
					break;
				}*/
				int ch=0;
				while((ch=fr.read())!=-1) {
					
					System.out.print((char)ch);
				}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
