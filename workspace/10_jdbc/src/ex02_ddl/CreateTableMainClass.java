package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class CreateTableMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//접속
			Connection con = DBConnection.getConnection();
			//쿼리문을 미리 준비한다.
			//preparedStatement클래스를 사용하므로
			//키워드는 대문자 ,테이블 칼럼은 소문자
			String sql="CREATE TABLE staff ("+
						"no NUMBER PRIMARY KEY," +
						"name VARCHAR2(100)," +
						"department VARCHAR2(100),"+
						"hireDate DATE"+
						")";
					//쿼리문
			//preparedStatement 객체 생성
			
			PreparedStatement ps = con.prepareStatement(sql);
			//쿼리문 실행
			
			ps.executeUpdate();
			System.out.println("staff 테이블이 생성되었습니다");
			
			//자원반남
			ps.close();
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
