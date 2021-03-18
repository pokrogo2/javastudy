package ex02_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*while(true){
			System.out.println(" 무한루프");
		}
		Scanner sc = new Scanner(System.in);
		
		char ch='A';
		while(ch>='A'&&ch<='Z') {
			System.out.println("입력하세요 ");
			ch=sc.next().charAt(0);
			
		}*/
		
		//입력받은 정수를 모두 더함
		// 0이상 모두더하고 음수가 입력되면
		// 합계를 출력해봅시다.
		
		Scanner sc = new Scanner(System.in);
		int a =0;
		int sum = 0;
		while(a>=0) {
			System.out.println("입력하세요 : ");
			a=sc.nextInt();
			if(a>=0) {
				sum+=a;
			}
			System.out.println("합은 " + sum);
		}
	}

}
