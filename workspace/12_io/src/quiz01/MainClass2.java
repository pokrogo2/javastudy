package quiz01;

import java.io.DataInputStream;
import java.io.FileInputStream;

//score.dat 파일을 읽어서 저장
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try(DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))){
			int [] scores = new int[dis.readInt()];
			String name =dis.readUTF();

			System.out.println("이름 : " + name);
			for(int i= 0; i<scores.length;i++) {
				scores[i]= dis.readInt();
				System.out.print(scores[i] + " ");
			}
			System.out.println();
			double ave = dis.readDouble();
			System.out.println("평균: " + ave);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}