package ex02_2d_array;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4. 성적 관리 프로그램
		//학생별 총점과 과목별 총점
		//스폰지밥 국어점수 >>10
		//스폰지밥 영어점수 >>
		//스폰지밥 수학점수 >>
		//타요의 국어점수 >>
		//...
		//		국 	영	수	총점
		//스폰지밥 10 10	10	30   0,3 에는 0,0 0,1 0,2 의 합
		//타요	10	10	10	30
		//합계
		
		String [] name = {"스밥    ","타요    ","레드    ","과목합계"};
		String [] sub = {"국어" , "영어" , "수학","학생합계" };
		int[][] scores = new int[name.length][sub.length];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<name.length-1;i++) {
			for(int j =0;j<sub.length-1;j++) {
				System.out.println(name[i]+"의 " + sub[j]+"점수를 입력하세요 :");
				scores[i][j]=sc.nextInt();
				scores[name.length-1][j]+=scores[i][j];
				scores[i][sub.length-1]+=scores[i][j];
			}
		}
		
		System.out.print("          ");
		for(String a : sub) {
			System.out.print(a+"  ");
		}
		System.out.println();
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i] + "   ");
			for(int j =0;j<sub.length;j++) {

				System.out.print(scores[i][j]+ " ");
				
			}
			System.out.println();
		}

	}

}
