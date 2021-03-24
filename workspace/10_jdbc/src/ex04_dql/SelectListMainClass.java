package ex04_dql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import connection.DBConnection;

public class SelectListMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps =null;
		ResultSet rs =null;
		
		try {
			con= DBConnection.getConnection();
			String sql = "SELECT * FROM staff";
			ps = con.prepareStatement(sql);
			rs =ps.executeQuery();
			List<Map<String,Object>> staffList = new ArrayList<>();
			while(rs.next()) {
				//결과 행 한개 : map
				//행 전체 : list
				Map<String,Object> staff = new HashMap<String, Object>();
				staff.put("no",rs.getInt(1));
				staff.put("name",rs.getString(2));
				staff.put("department", rs.getString(3));
				staff.put("hireDate", rs.getDate(4));
				staffList.add(staff);
			}
			System.out.println("검색된 스탭수 : " + staffList.size());
			for(Map<String,Object> staff :staffList) {
				System.out.println(staff);
			}
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			try {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
