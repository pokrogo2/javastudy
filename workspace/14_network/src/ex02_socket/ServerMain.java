package ex02_socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		try {
			server = new ServerSocket();
			server.bind(new InetSocketAddress("localhost",4966));
			//서버는 항상 켜져있음.(무한 루프)
			while(true) {
				
				//클라접속허용
				System.out.println("서버가 실행중");
				Socket client = server.accept();
				
				InetSocketAddress isa = (InetSocketAddress)client.getRemoteSocketAddress();
				System.out.println(isa.getHostName()+"클라이언트가 접속되었습니다.");
				
				//클라이언트에게웰컴 보내기
				String message = "Welcome to my Server!";
				OutputStream os = client.getOutputStream();
				os.write(message.getBytes("UTF-8"));
				os.flush();//스트림에 남아았는데이터 밀어내기
			}
		
		
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(!server.isClosed()) {server.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
