package ex02_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//break문
		//1.switch문을 종료
		//2.loop문 종료
		//주 사용 무한루프 + break
		//무한루프 while(true) or for(; ; )
		Scanner sc = new Scanner(System.in);
		/*String city = null;
		while(true) {
			System.out.println("수도는 ? : ");
			city = sc.next();
			if(city.equals("서울") || city.equalsIgnoreCase("seoul")) {
				System.out.println("정답");
				break;
			}
			else {
				System.out.println("오답");
			}
		}*/
		int a=1;
		int sum=0;
		while(true) {
		
			sum+=a;
			
			if(sum>=3000) {
				System.out.println("1부터 "+a+ "까지의 합은 "+sum + "입니다.");
				break;
			}
			a++;
		}
	}

}
