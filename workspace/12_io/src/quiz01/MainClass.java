package quiz01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//사용자로부터 국 영 수 점수를 입력받은뒤
//int [] 배열에 저장하고
// score.dat 파일에 이름, 점수, 평균을 저장
// score.dat 파일을 읽어서 저장을 확인하시오.

public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		FileOutputStream fos =null;
		String[] sub = {"국어","영어","수학"};
		int []score = new int[sub.length];
		String name ="james";
		double ave =0;
		int total=0;
		
		
		for(int i=0; i<sub.length;i++) {
			System.out.println(sub[i] + " : " );
		
			score[i]=sc.nextInt();
			total +=score[i];
		}
		ave =total/sub.length;
		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat"))){
			dos.writeInt(sub.length);
			dos.writeUTF(name);
			for(int scor:score) {
				dos.writeInt(scor);
			}
			dos.writeDouble(ave);
		
			

				
			
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		
		}
		sc.close();
	}

}
