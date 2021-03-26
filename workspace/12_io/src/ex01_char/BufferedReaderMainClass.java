package ex01_char;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(BufferedReader br =new BufferedReader(new FileReader("text3.txt"))){
			
			
			/*
			StringBuilder sb = new StringBuilder();
			while(true) {
				char[] cbuf = new char[5];
				int readCharCount = br.read(cbuf);
				if(readCharCount ==-1) {
					break;
				}
				sb.append(cbuf, 0, readCharCount); // 읽은 수만큼만 저장
				
			}
			System.out.println(sb.toString());*/
			
			char[] cbuf = new char[5];
			StringBuilder sb = new StringBuilder();
			int readCount =0;
			while((readCount=br.read(cbuf))!=-1) {
				sb.append(cbuf,0,readCount);
			}
			System.out.println(sb.toString());
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
