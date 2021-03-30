package ex02_socket;

import java.io.InputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Socket socket = null;
		try {
			socket = new Socket();
			//클라이언트 생성
			//클라이언트가 서버에 접속을 시도
			socket.connect(new InetSocketAddress("localhost",4966));
			//socket.connect(new InetSocketAddress("InetAddress.getByName(("localhost"),4966));
			
			//접속성공
			System.out.println("서버에접속되었습니다.");
		
		
			//웰컴 메세지받기
			InputStream is = socket.getInputStream();
			byte[]b = new byte[50];
			int length = is.read(b); //읽은내용 b에저장. 실제읽은 바이트수를 length에저장
			//
			String message = new String(b,0,length,"UTF-8");
	
			System.out.println(message);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket.isClosed()) {socket.close();}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
