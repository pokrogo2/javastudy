package ex02_byte;

import java.io.FileOutputStream;

/*
 	fileoutputStream클래스
 	바이트기반 출력스트림
 	모든것을 모낼때 사용
 		통신: 보낼때
 		파일: 텍스트 파일을 만들때
 	출력메소드 : write()
 	출력단위 char string int
 	예외처리필요
 */
public class FileOutputStreamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos =null;
		
		try {
			fos = new FileOutputStream("byte1.txt");
			int ch ='!';
			String str1="HELLO JAVA";
			String str2="안녕하세요. 반갑습니다.";
			
			fos.write(str1.getBytes());
			fos.write(ch);
			fos.write('\n');
			fos.write(str2.getBytes());
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
		try {
			if(fos!=null) {fos.close();}
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		}

	}

}
