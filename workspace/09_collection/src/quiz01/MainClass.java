package quiz01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

//임의의 Member를 3명 만들어서 저장해두고
// 사용자로부터 회원번호를 입력받아서 해당 회원의 삭제를 진행하시오.
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		java.sql.Date date = new java.sql.Date(System.currentTimeMillis());
		List <Member> list = new ArrayList<Member>();
		Member m1 = new Member(1,"제일스",date);
		Member m2 = new Member(2,"제이스",date);
		Member m3 = new Member(3,"제삼스",date);
		
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		System.out.println(list);
		int l = list.size();
		int a= -1;
		for(int i = 0; i<l; i++) {
			
		System.out.println("삭제할 회원번호를 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
		
		a= sc.nextInt();
		list.remove(a-1);
		System.out.println(list);
		
		for(Member m : list) {
			System.out.println(m);
		}
		sc.close();
		}
	}

}
