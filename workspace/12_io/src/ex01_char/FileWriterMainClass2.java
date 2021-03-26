package ex01_char;

import java.io.FileWriter;
import java.io.IOException;

//try - catch -resources 문
// close를 자동으로 호출하는 try문
//	형식
// try(스트림 생성){
// 
// }catch( ) {
//
//}
public class FileWriterMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(FileWriter fw = new FileWriter("text2.txt")){
			char[] cbuf = {'H','E','L','L','O'};
			fw.write(cbuf,0,cbuf.length);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
