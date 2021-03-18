package ex03_input;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//체질량 지수 구해서 건강상태 출력하기
		//double 몸무게와 키를 입력하고, 체질량 지수 = 몸무게 / 키(m)의 제곱
		//건강상태 = 25이상 "과체중",24 20 정상 19이하 저체중
		Scanner sc = new Scanner(System.in);
		System.out.println("몸무게와 키를 입력하세요 : ");
		double kg = sc.nextDouble();
		double m = sc.nextDouble()/100;
		double mm = m*m;
		double stat = kg/(mm);
		System.out.println("건강지수는 "+stat +"입니다.");
		String h = stat>=25 ? "과체중" : stat>=20 ? "정상" : "저체중";
		System.out.println(h);
	}

}
