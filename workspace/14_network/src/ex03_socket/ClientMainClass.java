package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket client = null;
		Scanner sc =null;
		BufferedOutputStream bos =null;
		BufferedInputStream bis =null;
		while(true) {
		try {
			client = new Socket();
			client.connect(new InetSocketAddress("localhost",4966));
			System.out.println("서버에 접속되었습니다.");
			
			sc = new Scanner(System.in);
			System.out.println("서버에 인사말 건네보기 : ");
			
			String msg = sc.nextLine();
			if(msg.equals("exit")) {
				break;
			}
			bos = new BufferedOutputStream(client.getOutputStream());//스트링을 그냥보내는 메소드가 없다. output은 바이트기반 
			//string에 메세지를 byte변환해야함
			bos.write(msg.getBytes("UTF-8"));
			bos.flush();//남아있는게 있다면 마저내보내기
			
			bis = new BufferedInputStream(client.getInputStream());
			byte []b = new byte[1024];
			int length = bis.read(b);// 메세지 : b, 메세지의 글자수는 length
			String msg1 = new String(b,0,length,"UTF-8");
			System.out.println(msg1);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(bos!=null) {bos.close();}
				if(bis!=null) {bis.close();}
				if(!client.isClosed()) {
					client.close();
					
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		}
	}

}
