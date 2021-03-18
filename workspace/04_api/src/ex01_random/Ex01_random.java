package ex01_random;

import java.util.Random;

public class Ex01_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//java.util.Random
		Random random = new Random();
		
		int rand1 = random.nextInt(); // int 중 하나
		int rand2 = random.nextInt(10); // 10개중 하나 (0~9)
		
		double rand3 =random.nextDouble();// 0~1사이. 확률 처리용.
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
	}

}
