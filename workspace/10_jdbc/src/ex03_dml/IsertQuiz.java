package ex03_dml;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import connection.DBConnection;

public class IsertQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//임의이ㅡ 3명staff 삽입
		//반복문과 배열 사용.
		Connection con = null;
		PreparedStatement ps =null;
		int[] noList= {3,4,5};
		String[] nameList = {"davi","jam","jack"};
		String [] departList = {"총무","영업","고객"};
		String [] hireDataList = {"21/03/18","21/03/15","21/03/20"};
		
		
		try {
			con = DBConnection.getConnection();
			String sql = "INSERT INTO staff (no,name,department,hireDate)VALUES(?,?,?,?)";
			ps= con.prepareStatement(sql);
			int result =0;
			for(int i=0;i<3;i++) {
				ps.setInt(1, noList[i]); //1번째 ? 에 2전달하기
				ps.setString(2, nameList[i]);
				ps.setString(3, departList[i]);
				ps.setString(4, hireDataList[i]);//날짜데이터가 스트링으로 처리될수있음.
				result += ps.executeUpdate();
				//쿼리문에 변수처리 부분은 ? 로 처리한다.
				System.out.println("총 " + result +"명이 추가되었습니다.");}
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
	}
			
		
	

}
