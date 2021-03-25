package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dto.StaffDto;

public class staffDao {

	//DAO : DATABASE Access Object
	//DB의 CRUD처리메소드 포함
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	private int result;
	private String sql;
	
	//하나의 staffdao만 생성할수있습니다. db접근수단이 하나다.
	// 원리
	// 외부에서는 new StaffDao() 가 불가능. new를못쓰게해야함. 
	// 내부에서는 new StaffDao()를 실행하고 생성된 1개의 인스턴스를 반환하는 메소드를만들면됨.

	private staffDao() {}
	private static staffDao staffDao = new staffDao(); //new는 실행될때 생성

	public static staffDao getInstance() {
		return staffDao; // 컴파일 과정
	}
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user="spring";
		String password="1111";
		
		return DriverManager.getConnection(url,user,password);
	}

	//2.접속해제
	public void close(Connection con,PreparedStatement ps, ResultSet rs) {
		try {
			if(rs!=null) {rs.close();}
			if(ps!=null) {ps.close();}
			if(con!=null) {con.close();}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	//3.가장 최근에 추가된 staff의 no알아내기
	
	public int selectMaxNo() {
		int no=0;
		try {
			con = getConnection();
			sql="SELECT MAX(no) FROM staff";
			ps= con.prepareStatement(sql);
			rs =ps.executeQuery();
			if(rs.next()) {
			no =rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				close(con,ps,rs);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return no;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//4.staff 추가하기
	
	
	//public int insertStaff(int no,String name, String department,Date hireDate)

	public int insertStaff(StaffDto staffDto) {
		try {
			con = getConnection();//접속은 메소드마다 열고 닫는게 제일좋다.
			sql ="INSERT INTO staff (no,name,department,hireDate) VALUES (?,?,?,SYSDATE)";
			ps= con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			ps.setString(2, staffDto.getName());
			ps.setString(3,staffDto.getDepartment());
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con, ps, null);
		}
		return result; //성공하면 1 실패하면 0
	}



	// 5. staff 수정하기 
	public int updateStaff(StaffDto staffDto) {
		try {
			con = getConnection();
			sql = "UPDATE staff SET name = ?, department=? WHERE no=?";
			ps=con.prepareStatement(sql);
			ps.setString(1, staffDto.getName());
			ps.setString(2, staffDto.getDepartment());
			ps.setInt(3, staffDto.getNo());	
			result  = ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,null);
		}
		return result;
	}
	//6. staff 삭제
	
	public int deleteStaff(StaffDto staffDto) {
		try {
			con =getConnection();
			sql = "DELETE FROM staff WHERE no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, staffDto.getNo());
			result =ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			close(con,ps,null);
		}
		return result;
	}
	
	//7. 조회
	
	public StaffDto selectOneByNo(int no) {
		StaffDto staffDto = null;
		try {
			con = getConnection();
			sql = "SELECT no,name,department,hireDate FROM staff WHERE no=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				staffDto = new StaffDto();
				staffDto.setNo(rs.getInt(1));
				staffDto.setName(rs.getNString(2));
				staffDto.setDepartment(rs.getNString(3));
				staffDto.setHireDate(rs.getDate(4));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,rs);
		}
		return staffDto;
	}
	
	//8. staff 전체조회
	public List<StaffDto> selectList(){
		List<StaffDto> staffList = new ArrayList<>();
		try {
			con = getConnection();
			sql = "SELECT no,name,department,hireDate FROM staff";
			ps= con.prepareStatement(sql);
			rs =ps.executeQuery();
			while(rs.next()) {
				StaffDto staffDto = new StaffDto();
				staffDto.setNo(rs.getInt(1));
				staffDto.setName(rs.getString(2));
				staffDto.setDepartment(rs.getString(3));
				staffDto.setHireDate(rs.getDate(4));
				staffList.add(staffDto);
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			close(con,ps,rs);
		}
		return staffList;
	}
	
	
	
	
	
	
	






}
