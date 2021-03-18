package ex02_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//loop문으로 되돌아가서 다시 실행
		//컨티뉴 문이후 코드를 실행하지않기위해 사용
	int n=1;
	/*while(n<=10) {
		if(n%2==1) {
			System.out.println(n);
		}
		n++;
	}
	
	while(n<=10) {
		if(n%2==0) {
			n++;
			continue;
		}
		System.out.println(n);
		n++;
	}*/
	//소원3개
	//안되는소원 "로또당첨"
	Scanner sc = new Scanner(System.in);
	String a1;
	String a2="";
	String l = "로또당첨";
	while(n<=3) {
		System.out.println("소원을 말해");
		a1=sc.next();
		if(l.equals(a1)) {
			continue;
		}
		else {
			a2+=a1;
			n++;
		}
		
	}
	System.out.println(a2);
	}

}
