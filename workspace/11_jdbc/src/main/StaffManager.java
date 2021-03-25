package main;

import java.util.List;
import java.util.Scanner;

import dao.staffDao;
import dto.StaffDto;

public class StaffManager {

	//f
	private staffDao dao = staffDao.getInstance();
	private Scanner sc =new Scanner(System.in);
	
	
	
	
	
	public void menu() {
		System.out.println("관리 프로그램 ");
		System.out.println("1. 사원 등록");
		System.out.println("2. 정보 수정");
		System.out.println("3. 퇴사 처리");
		System.out.println("4. 사원 검색");
		System.out.println("5. 전체 조회");
		System.out.println("6. 프로그램 종료");
		System.out.println("===========");
		System.out.println("");
		
	}
	public void execute() {
		while(true) {
			menu();
		System.out.println("선택 1~6");
		switch(sc.nextInt()) {
		case 1: insertStaff(); break;
		case 2: updateStaff(); break;
		case 3: deletStaff(); break;
		case 4:selectOne();break;
		case 5:selectList();break;
		case 6: System.out.println("프로그램을 종료합니다.");
		return;
		default:System.out.println("다시선택하세요");
		}
	}
		
}
	public void updateStaff() {
		System.out.println("수정할 사원번호 입력 : ");
		int no = sc.nextInt();
		//
		StaffDto staffDto = dao.selectOneByNo(no);
		System.out.println("수정할 내용을 선택하세요 : 1. 이름수정 \t 2.부서수정 ");
		int choice =sc.nextInt();
		if(choice ==1) {
			System.out.println("새로운 사원이름 입력 : ");
			String name =sc.next();
			staffDto.setName(name);		
			}else if (choice==2){
			System.out.println("새로운 부서이름 입력 : ");
			String department = sc.next();
			staffDto.setDepartment(department);
			staffDto.setNo(no);
			}else {
				System.out.println("잘못된 입력입니다.");
				return;
			}
		int result = dao.updateStaff(staffDto);
		System.out.println(result+"명의 정보가 수정되었습니다.");
	
	}
	
	

	public void deletStaff() {
		System.out.println("삭제할 사원번호 입력 : ");
		int no = sc.nextInt();
		//
		StaffDto staffDto = new StaffDto();
		
	
	
		staffDto.setNo(no);
		int result = dao.deleteStaff(staffDto);
		System.out.println(result+"명의 정보가  삭제되었습니다.");

	}

	
	
	public void selectOne() {
		System.out.println("조회할 사원 번호를 입력 >>");
		int no =sc.nextInt();
		StaffDto staffDto = dao.selectOneByNo(no);
		if(staffDto==null) {
			System.out.println("사원번호 " + no + "를 가진 사원이없습니다.");
		}else {
			System.out.println(staffDto);
		}
	}
	
	
	public void selectList() {
		List<StaffDto> staffList = dao.selectList();
		System.out.println("총 사원수 : " + staffList.size());
		for(StaffDto staffDto : staffList) {
			System.out.println(staffDto);
		}
	}
	
	
	
	
	
	
	
	
	
	public void insertStaff() {
		
		System.out.println("신규사원 이름 >>");
		String name = sc.next();
		System.out.println("신규사원 부서 >>");
		String department = sc.next();
		
		StaffDto staffDto = new StaffDto();
		int no = dao.selectMaxNo();
		staffDto.setNo(no+1);
		staffDto.setName(name);
		staffDto.setDepartment(department);
		int result = dao.insertStaff(staffDto);
		System.out.println(result + "명의 사원이 추가되었습니다.");
	}
}
