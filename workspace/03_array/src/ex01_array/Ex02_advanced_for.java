package ex01_array;

public class Ex02_advanced_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//advanced for: 향상된 for문
		//배열의 순회를 인덱스 없이

		int [] arr = {10,20,30};
		for (int n : arr) { // arr 배열의 모든 요소를 변수  n 으로 하나씩 전달하는 방식
			System.out.println(n);
		}
		
		//모든 배열의 요소를 1증가시키고 싶다.
		//arr[0]++,arr[1]++,arr[2]++
		//향상 for문
		/*for(int n :arr) {
			n++; // arr 요소 증가했나요? no 증가한것은 n
			
		}*/
		
		//advanced for문은 배열의 요소를 수정할수는 없다.
		//제한적임.인덱스를 활용하는 일반 for문이 배열의 요소를 수정할 수 있다.
		
		for(int i = 0; i<(arr.length);i++) {
			arr[i]++;
			System.out.println(arr[i]);
		}
	}

}
