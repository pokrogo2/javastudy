package ex02_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
		//1.산술연산자 : + - * / %
		System.out.println(7+2);
		System.out.println(7-2);
		System.out.println(7/2);//몫
		System.out.println(7*2);
		System.out.println(7%2);
		System.out.println(7.0/2.0);//나누기연산

		//2.증감 연산자 ++ --

		int a= 10;
		System.out.println(++a);//11 a를 먼저 증가시키고 출력
		System.out.println(a++);//11 출력하고 a증가
		int b =10;
		System.out.println(--b);// 9
		System.out.println(b--);//9
		System.out.println(a+b); //20
		//3.대입연산자 : =, +=, -= *= /= %=
		//문제 ) x와 y 를 교환해 봅시다
		int x = 1;
		int y= 2;
		int t = x;
		x=y;
		y=t;
		System.out.println(x);
		System.out.println(y);
		// a+=1 : a= a+1
		//문제 .  money를 5%증가시켜보세요.
		int money = 10023;
		money+=(int)(money*0.05);
		System.out.println(money);
	
	}

}
