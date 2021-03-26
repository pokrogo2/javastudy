package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Dto;

public class Dao {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	//1.접속
	public static Connection getConnection() throws Exception{
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url = "jdbc:orcle:thin:@127.0.0.1:1521:xe";
		String user = "spring";
		String password = "1111";
		return DriverManager.getConnection(url, user, password);
		
	}
	//2.접속해제
	public void close(Connection con,PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	//사원등록
	public int insert(Dto dto) {
		try{
			con = getConnection();
			sql = "ISERT INTO student(num,name,department,hireDate) VALUES(?,?,?,SYSDATE)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getNum());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getDepartment());
			ps.setDate(4, dto.getHireDate());
			
			result =ps.executeUpdate();
			
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,rs);
		}
		return result;
	}
	//사원 정보수정
	
	public int update(Dto dto) {
		try {
			con =getConnection();
			sql = "UPDATE student SET name=? , department=? WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setNString(2, dto.getDepartment());
			ps.setInt(3, dto.getNum());
			
			result = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,rs);
		}
		return result;
	}
	//삭제
	public int delete(Dto dto) {
		try {
		con = getConnection();
		sql = "DELETE stduent WHERE num=?";
		ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getNum());
		
		result= ps.executeUpdate();
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,rs);
		}
		return result;
	}
	
	public Dto select(int num) {
		Dto rsDto = null;
		try {
			con =getConnection();
			sql = "SELECT num,name,department,hireDate FROM student WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1,num);
			rs =ps.executeQuery();
			
			if(rs.next()) {
				rsDto =new Dto();
				rsDto.setNum(rs.getInt(1));
				rsDto.setName(rs.getString(2));
				rsDto.setDepartment(rs.getString(3));
				rsDto.setHireDate(rs.getDate(4));
				
				
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,rs);
		}
		return rsDto;
		
	}
	
	
	
	
	
	

}
