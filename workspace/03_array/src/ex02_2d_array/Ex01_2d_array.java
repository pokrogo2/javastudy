package ex02_2d_array;

public class Ex01_2d_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2차원 배열
		 * 2차원 배열은 테이블 형태로 이해
		 * 교졍형 2차원 / 가변형 2차원
		 * 선언
		 * int[][]= new int[3][2];
		 * int [][]a;
		 * a=new int[3][2];
		 * 가변형
		 * int [][] a = new int[3][]; //3행 n열
		 * 
		 * */
		//for을 이용한 순회
		int arr[][]=new int[3][2];
		arr[0][0]=10;
		arr[0][1]=20;
		arr[1][0]=30;
		arr[1][1]=40;
		arr[2][0]=50;
		arr[2][1]=60;
		for (int i =0;i<3;i++) {
			for(int j= 0; j<2;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}

	}

}
