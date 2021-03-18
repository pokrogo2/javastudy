package ex01_array;
/*
 * 
 * 배열
 * 변수가 여러개 필요할때 사용
 * 같은 이름을 공유
 * 선언
 * 1) int[] a= new int[3];
 * int 타입의 변수 3개를 생성
 * int [] a;
 * a = new int[3];
 * int a[] = new int[3];
 * 초기화
 * int []a = {10,20,30}
 * 주의  : 아래는 안됩니다.
 * int [] a;
 * a= {10,20,30}   
 * 초기화는 반드시 선언할때 같이 진행합니다.
 * 생성되는 변수 
 * int[] a = new int[3];
 * a[0] : 0 으로 초기화된 상태(자동)
 * a[1] : 0 으로 초기화된 상태(자동)
 * a[2] : 0 으로 초기화된 상태(자동)
 *
 *용어
 *int [] a = new int[3];
 * 배열 이름 : a
 * 배열 길이 : 3 (a,length)
 * 인덱스 : 0, 1, 2
 * 	사용이 불가능한 인덱스를 사용하면 ArrayIndexOutOfBoundsException 예외 발생
 * */
public class Ex01_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int[3];
/*		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		0~배열 길이 -1까지 인덱스
		
		배열의 순회
		*/
		for(int i=0; i<(a.length); i++) {
			System.out.println(a[i]);
			
		
		}
	
		System.out.println(a[2]);
		
	
	
	}

}
