package ex01_random;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~25를 bingo 배열에 순서대로 저장하고
		// 섞는다. (5x5)
		
		//final상수 : 변하지 않는 값
		final int SIZE = 5;
		int [][] bingo = new int[SIZE][SIZE];
		for(int i =0; i<SIZE; i++) {
			for(int j =0;j<SIZE;j++) {
				bingo[i][j]=(i*SIZE)+ j+1; //순서대로 배열에 저장함
			}
		}
		// 섞기
		for(int i=0;i< SIZE; i++) {
			for(int j =0;j<SIZE;j++) {
				int x1 = (int)(Math.random()*SIZE);
				int y1 = (int)(Math.random()*SIZE);
			
				int temp = bingo[i][j];
				bingo[i][j] =bingo[x1][y1];
				bingo[x1][y1]=temp;

			}
			
		}
		for(int i=0;i< SIZE; i++) {
			for(int j =0;j<SIZE;j++) {
	
				System.out.print(bingo[i][j]+"\t");
				
			}
			System.out.println();
		}

	}

}
