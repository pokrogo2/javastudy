package quiz02;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~10000 사이의 값을 가지고 있는 ArrayList를 2개 만들고,
		//모든 요소를 하나씩삭제합니다..
		//1.가장 성능이 나쁜방법. //땡겨오는게 많을수록 구림.
		//2.가장 성능이 좋은방법. // 땡겨오는게 적을수록빠름.
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2= new ArrayList<Integer>();
		
		for(int i=1; i<=10000; i++) {
			list1.add(i);
			list2.add(i);
		}
		//list1
		long start1 =System.nanoTime();
		
		for(int j=1,length = list1.size(); j<=length; j++) {
			list1.remove(0);
		}
		
		long end1 =System.nanoTime();
		System.out.println("list1의 속도 : " + (end1-start1) +"ns");
		//list2
		
		long start2 =System.nanoTime();
		
		for(int j=list2.size(); j<=0; j--) {
			list2.remove(j-1);
		}
		
		long end2 =System.nanoTime();
		System.out.println("list2의 속도 : " + (end2-start2) +"ns");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
