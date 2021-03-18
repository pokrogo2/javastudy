package ex01_random;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//윳놏이 도 1 개 2 걸 3 윷 또던짐4+n 모 또던짐5+n
		
		String[] yut = {"도","개","걸","윷","모"};
		int move = 0;
		
		while(true) {
			//윷은 프로그램이 던집니다.
			int i = (int)(Math.random()*5);
			System.out.print(yut[i]);
			move=i+1;
			//도 개 걸은 끝
			if(i<3) {
			
				System.out.print(","+move+"만큼 이동합니다.");
				break;
			}else {
				System.out.print(",");
			}
		}

	}

}
