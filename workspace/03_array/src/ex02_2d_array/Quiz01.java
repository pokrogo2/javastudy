package ex02_2d_array;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 인구 조사
		//apt에 사는 사람 수를 초기화 하고
		//전체 사람의 수를 출력하기
		// 1층에 3명이 삽니다. 2층에 7명 3층 6.. 5층에 7명이 삽디ㅏ.

		int[][] apt = {
				{1,2},
				{5,2},
				{3,3},
				{1,4},
				{5,2}
		};
		int count=1;
		int total=0;
		for(int[] a :apt ) {
			int sum=0;
			for(int b : a) {
				
				sum+=b;
			}
			System.out.println(count +"층에 " +sum +"명이 삽니다.");
			total+=sum;
			
			count++;
		}
		System.out.println(total+"명이 아파트에 살고있습니다.");
	}

}
