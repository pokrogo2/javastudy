package ex02_loop;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//5. 10000원 모두 사용하기
		//현재 10000원이 있습니다. 결제금액 입력받기 >>5000
		//현재 5000원 있습니다. 결제금액이 >>-500
		//-100원은 결제할수없습니다.
		//결제금액 >> 10000 
		//5000원이 부족합니다. 현재 5000원
		
		int money = 10000;
		Scanner sc = new Scanner(System.in);
		while(!(money==0)) {
		System.out.println("결제금액 : ");
		int price = sc.nextInt();
		
		if(money>=price&&price>=0) {
			money-=price;
			System.out.println(price+"원을 결제하고 " + money+"원이 남았습니다.");
		}
		else if(price>money) {
			System.out.println(price +"원은 결제할 수 없습니다." +(price-money)+"원이 부족합니다.");
		}
		else {
			System.out.println(price+"원은 결제할수 없습니다.");
		}
	}}

}
