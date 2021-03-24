package connection;

import java.sql.Connection;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DBConnertion클래스의 getConnection()호출
		//getConnection() throws Exception이므로 trycatch필요
		
		try {
			//DBConnection connection =new DBConnection(); 인스턴스 메소드
			//DBConnection connection1 =new DBConnection(); 새로만들어도 기존과 하나도 다르지않음. new또한 필요없음
			//Connection con = connection.getConnection();
			
			Connection con = DBConnection.getConnection(); // 클래스 메소드 getConnection /static으로처리
			System.out.println("Db에 접속되었습니다.");
			con.close();
			System.out.println("db접속이 해제되었습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
