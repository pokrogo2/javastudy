package ex06_class;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Updown {
	private int answer; // 발생된 난수
	private int count;//시도횟수
	private Scanner sc= new Scanner(System.in);
	
	public Updown() {
		answer = (int)(Math.random()*100) + 1;//1~100

	}
	//method
	public int challenge() throws UpdownException,InputMismatchException{
		count++;
		System.out.println("1~100사이의 정수를 입력 : ");
		int n = sc.nextInt(); // 입력이 int가아니면 inputmismatchE가발생
		if(n<1 ||n>100) {
			throw new UpdownException();
		}
		return n;
	}
	public void play() {
		while(true) {
			try {
				int n=challenge();
				if(n < answer) {
					System.out.println("up");
					System.out.println(answer);
				}else if(n>answer) {
					System.out.println("down");
					System.out.println(answer);
				}else {
					System.out.println("정답 : " + answer + "맞춤" + count+"만에 정답");
					return;
				}
			} catch (UpdownException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}//updown/input 이 발생 >> try로 예외처리.
			catch(InputMismatchException e) {
				// 정수가 아닌값이 입력되는 경우 값이 저장되지못하고 입력에 남아있기때문에 제거가 필요하다.
				sc.next(); //그냥 어딘가에 저장. 사용목적이아님.
				System.out.println(e.getMessage());
			}
		}
	}

}
