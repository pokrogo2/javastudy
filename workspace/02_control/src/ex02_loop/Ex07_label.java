package ex02_loop;

public class Ex07_label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//label : 소스코드의 특정 위치를 저장.
		// label : 소스코드
		outer: for(int dan =2;dan<=9; dan++) {
			inner : for(int n=1;n<=9; n++) {
				System.out.println(dan+"x"+n+"="+(dan*n));
				if(dan==5&&n==5) {
					break outer;
				}
			}
		}
	}

}
