package ex02_try_catch;
/*
 	try{
 		asdfasdfadsfsaf;예외 발생가능구역
 		}Catch(예외처리 매개변수){
 		
 */
public class MainClass {

	public static void main(String[] args) {
		int a=0;
		try {
			//System.out.println(2/0); //예외 발생하면
			Integer.parseInt("1.5");
			a=10; // 실행안됨
		}catch(ArithmeticException e) {//예외시 catch문으로넘어감
			System.out.println("예외 발생");
		}catch(NumberFormatException e) {
			System.out.println("예외 발생2");
		}
		
		try {
			String name =null;
			name.equals("james");
			
		}catch(Exception e) { // Exception 은 모든 예외클래스의 슈퍼클래스
			System.out.println("예외 발생3");
		}
		
		
		
		
		
		
		
		
		System.out.println(a);
	}
}
