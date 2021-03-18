package ex01_branch;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//점수를 입력받아서 해당하는 학점을 출력하세요
		//char grade : S A B C F
		//char point : + 0 - ' '
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();

		char point = '-';
		switch(num %10) {
		case 9:
		case 8:
		case 7:
			point ='+';
			break;
		case 6: case 5: case 4:
			point = '0';
			
		}
		char grade = 'F';
		switch(num/10) {
		case 10:
			grade = 'S';
			point = ' ';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default:
			point = ' ';
		}
		System.out.print(grade);
		System.out.print(point);

	}

}
