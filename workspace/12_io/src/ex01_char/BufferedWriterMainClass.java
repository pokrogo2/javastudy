package ex01_char;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//BufferedWriter클래스
// 보조스트림입니다.
//FileWriter클래스와 같은 메인스트림과 함께 사용
// 내부 버퍼를 이용해서 동작속도를 향상시킬 수있다.
public class BufferedWriterMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("text3.txt");
			bw = new BufferedWriter(fw);
			bw.write("안녕하세요 \n");
			bw.write(" 반갑습니다.");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//보조스트림 bw를 사용할때는 bw만 닫으면된다.
			try{
				if(bw!=null) {bw.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
