package ex02_operator;

public class Ex03_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//6.조건 연산자 (삼항연산자)
		//조건식 ? true일 때 : false 일때
		int score = 50;
		String pass = score >=60 ? "합격" : "불합격";
		System.out.println(pass);
		// 문제 1. 평균이 85 이상이거나 국어와 영어 점수 모두 80이상이면 합격, 아니면 불합격
		int kor = 80;
		int eng = 90;
		String Q1 = (kor+eng)/2>=85 ||(kor>=80&&eng>=80) ? "합격" : "불합격"; 
		//문제 2. 2자리(10~99)정수 중에서  하나를 임의로 선언하고,
		//그 값이 '카프리카 수' 이면 "맞다",아니면 "아니다"출력
		//45,55,99가 카프리카 수 입니다.
		int n=99; //45*45 = 2025 >> 20 25 각각을 더하면 45
		int square =n*n;//Math.pow(n,2)=n*n;
		int front =square/100;
		int back = square%100;
		
		String Q2 = (front +back==n) ? "카프리카 수 입니다" : "카프리카 수가 아닙니다.";
		System.out.println(Q1);
		System.out.println(Q2);

	}

}
