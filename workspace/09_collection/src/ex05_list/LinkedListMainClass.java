package ex05_list;
/*
 * ArrayList 클래스
 * 1. List인터페이스를 구현한 클래스
 * 2.ArrayList<E> list =new ArrayList<E>();
 * 2-1.List<E> list =new ArrayList<E>();
 * 3. 배열을 구현한 클래스. 자동으로 길이를 조정합니다.
 * 4. 장점 : 모든위치에 추가 /삭제가빠름
 * 5. 단점 : 순차적인 접근이 느리다.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMainClass {
	public static void main(String[] args) {
		
	

	// 성능비교
	
	//1.추가
	List<Integer> list1 = new ArrayList<>();
	List<Integer> list2 = new LinkedList<Integer>();
	
	//인덱스 0에 데이터추가
	long start1 = System.nanoTime();
	for(int n=1; n<=10000;n++) {
		list1.add(0,n);
		
	}
	long  end1 =System.nanoTime();
	System.out.println("array list 시간 : " + (end1-start1)+"nano time");
	//linked
	long start2 = System.nanoTime();
	for(int n=1; n<=10000;n++) {
		list2.add(0,n);
		
	}
	long  end2 =System.nanoTime();
	System.out.println("linked list 시간 : " + (end2-start2)+"nano time");
	
	//2.순회
	
	long start3 =System.nanoTime();
	for(int i=0,length=list1.size(); i<length; i++) {
		list1.get(i);
	}
	long end3 = System.nanoTime();
	
	System.out.println("어레이 순회시간 : "+  (end3-start3) +"ns");
	
	
	long start4 =System.nanoTime();
	for(int i=0,length=list2.size(); i<length; i++) {
		list2.get(i);
	}
	long end4 = System.nanoTime();
	
	System.out.println("링크드 순회시간 : "+  (end4-start4) +"ns");
	
	
	
	
	
}
}