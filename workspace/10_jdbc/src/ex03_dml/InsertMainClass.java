package ex03_dml;


import java.sql.*;

import connection.DBConnection;
public class InsertMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no,name,department,hireDate) VALUES(1,'alice','총무','21/03/22')";
			ps = con.prepareStatement(sql);
			int result = ps.executeUpdate();
			//execute update에 반환값은 
			//변화가 생긴 행의 갯수가 반환. 실패하면 0반환
			if(result ==0) {
				System.out.println("행이 추가되지않았습니다.");
			}else {
				System.out.println("행이 추가되었습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {ps.close();}
				if(con!=null) {con.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
