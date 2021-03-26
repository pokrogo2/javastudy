package ex02_byte;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("byte2.txt"))){
			String str ="안녕하세요 반갑습니다.";
			byte[] bytes = str.getBytes();
			bos.write(bytes);
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
