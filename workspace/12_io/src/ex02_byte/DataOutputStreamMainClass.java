package ex02_byte;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

//data output stream 클래스
//1. 자바의 데이터타입 그대로 출력하는 클래스
//2. 출력메서드
// writebyte writeint writelong writedouble 등등
public class DataOutputStreamMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataOutputStream dos =null;
		try {
			dos = new DataOutputStream(new FileOutputStream("byte3.dat"));
			
			int age=44;
			double weight =70.5;
			String name ="민경태";
			dos.writeInt(age);
			dos.writeDouble(weight);
			dos.writeUTF(name);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null) {dos.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
