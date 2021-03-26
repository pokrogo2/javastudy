package ex02_byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("byte3.dat"))){
			byte[] bytes = new byte[5];
			while(true) {
				int readByte = bis.read(bytes); //읽은 데이터는 bytes배열에 저장, 실제읽은 바이트수가 readbyte에저장.
				if(readByte ==-1) {
					break;
				}
				System.out.println(new String(bytes));
			}
		}catch (Exception e) {
			e.printStackTrace();
			}
			}

	}

