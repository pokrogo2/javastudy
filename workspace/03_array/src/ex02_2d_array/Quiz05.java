package ex02_2d_array;
//5.영한사전
// "영어단어" 와 "의미" 를 배열에 저장하고.
//묻고 답하는 프로그램
//봄을 영어로하면 ?? >>spring 
//정답
//여름을 영어로하면 ?? >>summer
//정답
//가을 겨울까지

import java.util.Scanner;

//2문제 맞히고 2문제를 틀렸습니다.
public class Quiz05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[][] dict = {
				{"봄","spring"},
				{"여름","summer"},
				{"가을","fall"},
				{"겨울","winter"}
		};
		int wrong =0;
		for(int i=0;i<dict.length;i++) {
			System.out.print(dict[i][0]+"을 영어로 하면? >>");
			String anw=sc.next();
			if(dict[i][1].equals(anw)) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("오답입니다.");
				wrong++;
			}
		}
		System.out.println("맞힌 개수는 : " + (dict.length-wrong)+"입니다.");
		System.out.println("틀린 개수는 : " + wrong+"입니다.");
		
	}
}
