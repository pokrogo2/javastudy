package ex01_char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedWriter bw = new BufferedWriter(new FileWriter("text4.txt"))){ // 리소스로 사용시 close필요없음.
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("반갑습니다");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
