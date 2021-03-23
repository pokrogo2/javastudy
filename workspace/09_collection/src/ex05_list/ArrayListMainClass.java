package ex05_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMainClass {
/*
 * ArrayList 클래스
 * 1. List인터페이스를 구현한 클래스
 * 2.ArrayList<E> list =new ArrayList<E>();
 * 2-1.List<E> list =new ArrayList<E>();
 * 3. 배열을 구현한 클래스. 자동으로 길이를 조정합니다.
 * 4. 장점 : 순차적인 접근
 * 5. 단점 : 중간 위치에 추가/삭제가 느림.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.생성
		List<String> list = new ArrayList<String>();
		list.add("브레드");
		list.add("짱구");
		list.add("자두");
		
		list.remove(0);
		list.remove("짱구");
		System.out.println(list.size());
		
		if(list.contains("둘리")) {
			System.out.println("있음");
		}else {
			System.out.println("없음");
		}
		
		System.out.println("첫 번째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " +list.get(list.size()-1));
		
		//7.전체순회
		//1 일반 for무ㅡㄴ
		/*int length = list.size();
		for(int i=0; i<length;i++) {
			System.out.print((i+1)+"번째요소 : " + list.get(i));
		
		}*/
		for(String e : list) {
			System.out.println(e);
		}
		
		//8. 출력
		System.out.println("한번에 출력 : " + list);
		//9. 초기화
		list.clear();
		System.out.println(list);
		
		
		
		
	}

}
