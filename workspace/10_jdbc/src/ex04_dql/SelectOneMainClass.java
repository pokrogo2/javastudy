package ex04_dql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;

import connection.DBConnection;

public class SelectOneMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con =null;
		PreparedStatement ps =null;
		ResultSet rs = null; // select문의 결과 (행)을 저장합니다.
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT no,name,department,hireDate FROM staff WHERE no = 1";//구분이 no를 기준으로만됨
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); //select 는 업데이트가아님
			//rs에 저장된 데이터는 반드시 next메소드를 호출해서 꺼내야함.next하나할때마다 한행씩 호출
			//결과행이 존재하면 true/없으면 false
			if(rs.next()) {
				HashMap<String, Object> map1 = new HashMap<>();
				
				map1.put("no",rs.getInt(1));
				map1.put("name",rs.getString(2));
				map1.put("department",rs.getString(3));
				map1.put("hireDate",rs.getDate(4));
				System.out.println("no = " +map1.get("no")+"name = " + map1.get("name")+"department = " + map1.get("department")+"hiredate = " + map1.get("hireDate"));
				
				/*int no = rs.getInt(1);
				String name=rs.getString(2);
				String department = rs.getString(3);
				Date hireDate = rs.getDate(4);
				System.out.println("no : "+no+"\t name : " +name+"\t department : "+department+"\t hireDate : " + hireDate); //getInt(인덱스) or getInt("NO")
			*/
			
			}else {
				System.out.println("해당 staff없음");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {rs.close();}
				if(ps!=null) {ps.close();}
				if(con!=null) {con.close();}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
