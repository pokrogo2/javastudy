package ex03_socket;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocket2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket server = null;
		BufferedInputStream bis =null;
		Scanner sc = new Scanner(System.in);
		BufferedOutputStream bos = null;
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",4966));
			//서버는 항상 켜져있음.(무한 루프)
			
			while(true) {
				System.out.println("서버가 동작하고 있습니다.");
				Socket client = server.accept();
				InetSocketAddress isa =(InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println("접속 클라이언트 : " + isa.getHostName());
				
				//클라이언트가 보낸 메세지 받기
				bis = new BufferedInputStream(client.getInputStream());
				byte []b = new byte[1024];
				int length = bis.read(b);// 메세지 : b, 메세지의 글자수는 length
				String msg = new String(b,0,length,"UTF-8");
				System.out.println(msg);
				//-----------------------------------------------------
				bos = new BufferedOutputStream(client.getOutputStream());
		
				//클라이언트에게 답변보내기
				System.out.println("답변을 입력하세요 : ");
				String msg2 = sc.nextLine();
				bos.write(msg2.getBytes("UTF-8"));
				bos.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}finally {try {
			
		
			if(bos!=null) {bos.close();}
			if(bis!=null) {bis.close();}
			if(!server.isClosed()) {server.close();}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	}

}
