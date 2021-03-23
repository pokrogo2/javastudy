package ex06_set;

import java.util.HashSet;
import java.util.Set;

public class HashSetMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	hash set 클래스
		 	Set 인터페이스를 구현한 클래스
		 	기본특징
		 		인덱스가 없다,순서상관없다
		 		중복저장이 불가능 (구분이안됨)
		 	기본적인 사용법은 list와 같지만 인덱스가 없음.	
		 */
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("java");

		set.add("jsp");
		set.add("jsp");
		
		set.add("spring");
		set.add("spring");

		System.out.println("개수 : " +set.size());
		for(String s : set) {
			System.out.println(s);
		}
	}

}
