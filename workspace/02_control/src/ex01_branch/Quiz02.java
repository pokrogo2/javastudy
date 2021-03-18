package ex01_branch;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//나이를 입력받아서 구분출력

		//7이하 미취학,13이하 초 16이하 중 19이하 고 20이상 성인
		//1~100을 벗어나면 : "불가능한 나이"
		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		if(age<=7) {
			System.out.println("미취학");
		}
		else if(age<=13) {
			System.out.println("초등학생");
		}
		else if(age<=16) {
			System.out.println("중학생");
		}
		else if(age<=19) {
			System.out.println("고등학생");
		}
		else if(age<=100) {
			System.out.println("성인");
		}
		else {
			System.out.println("불가능한 나이");
		}
	}

}
