package ex02_2d_array;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.구구단의 결과만 2차원 배열에 저장하고. 출력하기.
		
		int [][] a= new int[8][9];
		
		for(int i =2 ; i<=9;i++) {
			System.out.print(i+"단의 결과값 : " );
			for(int j =1; j<=9;j++) {
				a[i-2][j-1]=i*j;
				System.out.print(a[i-2][j-1]+ " ");
			}
			System.out.println();
		}
	}

}
