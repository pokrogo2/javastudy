package ex01_random;

public class Ex02_math {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//java.lang.Math 기본클래스
		
	; // 0~1
		//math.random()의 결과가 0.1보다 작을확률 ? 10%
		//math.random()의 결과가 0.1보다 작을확률 ? 20%
		//10%로 성공, 실패
		if(Math.random()<0.1) {
			
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
	}
		
	int lotto = (int)(Math.random()*45 +1);{
		System.out.println(lotto);
	}
	
	
	
	}
	//일반화 공식처럼 사용
	//원하는 난수 범위
	//(int)(Math.random()*개수)+시작값
	//(int)(Math.random()*6)+1 >> 1부터 6개>>주사위
	

}
