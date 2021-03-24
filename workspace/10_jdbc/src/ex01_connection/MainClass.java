package ex01_connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. oracle.jdbc.driver.OracleDriver 클래스를 메모리에 올립니다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //classnotFoundException 발생가능. 없을때
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // Oracle 11g Express Edition용. express edition == thin driver
			// db서버 주소 127.0.0.1 == localhost
			
			String user = "spring"; //대소구분x
			String password = "1111";
			
			//접속
			//driverManager 클래스가 접속을 담당하고,
			//접속 결과는 Connection 인터페이스에 저장합니다.
			Connection con = DriverManager.getConnection(url, user, password); //SqlException 발생
			
			//접속이 성공하면
			System.out.println("DB에 접속되었습니다.");
			
			//접속종료
			con.close();
			
		}catch(Exception e){ // 접속이 실패하면
			e.printStackTrace();
			
		}
		
		//오류 ,예외처리도해줘야함.
		
		
		
		
		
		
		
	}

}
