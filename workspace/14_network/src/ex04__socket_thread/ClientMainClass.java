package ex04__socket_thread;

import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;



public class ClientMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket client = null;
		Scanner sc = null;
		File dir =null;
		File file =null;
		DataOutputStream dos=null;
		BufferedInputStream bis =null;
		
		try {
			sc = new Scanner(System.in);
			client = new Socket();
			client.connect(new InetSocketAddress("localhost",4966));
		
			System.out.println("전송할 파일을 입력하세요 >> ");
			String filename=sc.nextLine();
			
			dir= new File("C:\\MyClient");
			file= new File(dir,filename);
		
			dos = new DataOutputStream(client.getOutputStream());
			dos.writeUTF(filename);
			bis = new BufferedInputStream(new FileInputStream(file));
			
			byte[] b =new byte[1024];
			int length=0;
			while((length = bis.read(b))!=-1) {
				dos.write(b,0,length);
			}
			System.out.println(file.getAbsolutePath() + "파일을 서버로 전송했습니다.");
			//성능을위한 buffer 읽기위한 file input
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(dos!=null) {dos.close();}
				if(bis!=null) {bis.close();}
				
				if(!client.isClosed()) {client.close();}
				
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
