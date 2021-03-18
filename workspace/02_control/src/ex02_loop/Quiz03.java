package ex02_loop;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//비밀번호를 asdf로 가정
		//비밀번호를 입력받아서 일치하면 로그인되었습니다.일치하지않으면 비밀번호를 확인하세요.
		//5까지입력가능
		//5번실패하면 비밀번호 입력 횟수를 초과하였습니다.
		Scanner sc = new Scanner(System.in);
		String pw= "asdf";

		int count =0;
		while(true) {
			System.out.println("비밀번호를 입력하세요 : ");
			String pw1= sc.next();
			if(pw1.equals(pw)) {
				System.out.println("로그인 되었습니다");
				break;
			}
			else {
				System.out.println("비밀번호를 확인하세요");
				count++;
				if(count>=5) {
					System.out.println("입력가능횟수를 초과하였습니다.");
					break;
				}
					
			}
		}
	}

}
