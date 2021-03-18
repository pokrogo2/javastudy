package ex01_random;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.임시비밀번호 발급하기
		//2. 영문대문자 + 아라비아 숫자 6자리
		//약 5 : 5
		/*
		char[] charSet = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I',
				'J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String pw="";
		System.out.println();
		for(int n=0;n<6;n++) {//6번반복
			int idx = (int)(Math.random() * charSet.length+0);
			pw+=charSet[idx];
			
			
		}
		System.out.println(pw);*/
		String pw="";
		for(int n = 0; n<6;n++) {
		if(Math.random()<0.5) {
			int arabia=(int)(Math.random()*10)+'0';
			pw+=(char)arabia;
			
		}
		else {
		int alphabet = (int)(Math.random()*26+'A');
		pw+=(char)alphabet;
		}
		System.out.println(pw);
		}
	}
	}
