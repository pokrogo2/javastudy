package ex01_random;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6.로또 구매
		// 1000원에 번호 6개 세트
		// 얼마 ? >>5000운 >> 5줄
		//한줄에는 같은번호가 있어선 안됨
		
		final int SIZE = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마치를 구매하시겠습니까? : ");
		int line = sc.nextInt()/1000;
		
		int [][] lotto = new int[line][6];
		
		for(int i=0; i<line; i++) {//for1
			int ballcount=45;
			int[]balls = new int[ballcount];
			for(int j=0;j<balls.length; j++) {//for2
				balls[j] = j+1;
				

			}//for2end
			// balls 배열 > lotto 배열
			// balls배열의 인덱스를 랜덤생성
			// 해당 인덱스의 값을 lotto로 보낸다
			// balls 배열의 마지막 요소를 랜덤 생성한 인덱스로 보낸다.
				
				for(int j =0;j<lotto[i].length;j++) {//for3
					int idx = (int)(Math.random()*ballcount);
					lotto[i][j] = balls[idx];
					int lastIdx = 44-1-j;
					if(idx!=lastIdx) {
						balls[idx]= balls[lastIdx];
					}
					ballcount--;
				}//for3end
				//오름차순 정렬
		}//for1 end
		for(int [] set : lotto) {
			Arrays.sort(set);
			for(int n : set) {
				System.out.print(n+"\t");
			}
			System.out.println();
		}

		
	}

}
