package ex02_ddl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnection;

public class DropTableMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try{}내에서 선언되면 finally에서는 사용할수없으므로 메인메소드에 선언
		Connection con =null;
		PreparedStatement ps=null;
		try {
			con = DBConnection.getConnection();
			String sql = "DROP TABLE staff";
			 ps = con.prepareStatement(sql);
			System.out.println("staff 테이블이 삭제되었습니다.");
			ps.executeUpdate(); //오류발생시 아래코드 실행안댐. finally에 넣어준느게좋음
			
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			
			try {
				if(ps!=null){ps.close();}//con = DBConnection.getConnection();에서 오류발생하면 바로 catch이동하고 finally로가게되어 null을 close할수없으니 
				if(con!=null) {con.close();}// 그럼if(ps!=null){ps.close();}하면됨
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
