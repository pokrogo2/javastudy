package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class DeleteMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con =null;
		PreparedStatement ps =null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "DELETE FROM staff where department = '영업'";
			ps = con.prepareStatement(sql);
			int result =ps.executeUpdate(); //
			if(result ==0) {
				System.out.println("삭제실패");
			}else {
				System.out.println(result + "명의 정보 삭제성공");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
