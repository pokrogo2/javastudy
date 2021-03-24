package ex03_dml;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class InsertMainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no,name,department,hireDate)VALUES(?,?,?,?)";
			ps = con.prepareStatement(sql);
			//변수처리부터해야함
			ps.setInt(1, 2); //1번째 ? 에 2전달하기
			ps.setString(2, "emily");
			ps.setString(3, "인사");
			ps.setDate(4, new Date(System.currentTimeMillis())); // 4번째 ?에 
			int result = ps.executeUpdate();
					//쿼리문에 변수처리 부분은 ? 로 처리한다.
			if(result ==0) {
				System.out.println("행이 추가되지않았습니다.");
			}else {
				System.out.println("행이 추가디었습니다.");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null)ps.close();
				if(con!=null)con.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
