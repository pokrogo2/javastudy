package ex01_array;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//성적 관리 프로그램
		//학생들의 점수를 입력받아서
		//평균 구해보기. 최대 최소 점수출력
		int sum=0;
		Scanner sc = new Scanner(System.in);
		String[] students = {"타요","브레드","스폰지밥"};
		int [] scores = new int[students.length];
		
		for(int i = 0; i<students.length;i++) {
			System.out.println(students[i] + "의 점수를 입력하세요 : ");
			scores[i]=sc.nextInt();
			sum+=scores[i];
			
		}
		double avg= (double)sum/students.length;
		int max=scores[0];
		int min=scores[0];
		for(int j=0; j<scores.length;j++) {
			if(scores[j]>max) {
				max=scores[j];
			}
			if(scores[j]<min) {
				min=scores[j];
			}
			
			
		}
		System.out.println("평균점수는 : " + avg + "입니다.");
		for(int i =0; i<scores.length; i++) {
				if(max ==scores[i]) {
		System.out.println("최댓값은 : " + max + "입니다." +students[i]);}
				if(min==scores[i])
		System.out.println("최소값은 : " + min + "입니다."+students[i]);
	}
	}

}
