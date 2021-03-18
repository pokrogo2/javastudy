package ex01_array;

public class Ex03_array_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = new int[3];
		
		System.out.println(arr); // new int [3]을 통해서 생성된 배열요소들의 주소가 저장되있다.
		
		int []a= {1,2,3};  // 길이는 3
		int [] b= new int[10];  // 길이는 10
		// 
		for(int i =0; i<a.length;i++) {
			b[i]=a[i];
			System.out.println(b[i]);
		}
		//a에는 {1,2,3}이 저장된 주소
		//b에는 {1,2,3,0,0,0,0,0,0,0}이 저장된 주소가 있습니다.
		a=b; // a에는 b의 값이 저장됨{1,2,3,0,0,0,0,0,0,0}
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
