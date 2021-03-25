package dto;

import java.sql.Date;

public class StaffDto {
	//db table에 저장된 행(row)을 저장하는 클래스
	//vo : value object
	//dto : data transfer object
	
	//테이블칼럼	 클래스필드
	//BOARD_NO	boardNo
	//BNO		bNo
	
	
	//dto만들때 게터세터 필수. 디폴트생성자 필수.
	private int no;
	private String name;
	private String department;
	private Date hireDate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDepartment() {
		return department;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "StaffDto [no=" + no + ", name=" + name + ", department=" + department + ", hireDate=" + hireDate + "]";
	}
	
	
	
	

}
