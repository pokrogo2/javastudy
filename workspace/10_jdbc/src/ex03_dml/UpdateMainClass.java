package ex03_dml;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class UpdateMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps =null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "UPDATE staff SET department = ? WHERE no=?";
			ps= con.prepareStatement(sql);
			ps.setString(1, "영업");
			ps.setInt(2, 3);
			int result = ps.executeUpdate();
			if (result ==0) {
				System.out.println("수정실패");
			}else {
				System.out.println("수정성공");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}catch(Exception e) {
			e.printStackTrace();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}}
