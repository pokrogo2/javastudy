package ex02_loop;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//4.아래와 같은 모습으로 출력해 보기
		//2x1 3x1 .. 9x1
		//2x2 3x2 .. 9x2
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+ "\t");
			}
			System.out.println("");
		}
	}

}
