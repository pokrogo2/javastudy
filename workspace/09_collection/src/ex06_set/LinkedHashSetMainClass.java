package ex06_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//순서 , LinkedHashSet은 저장된 요소들의 순서가 유지된다.
		Set<String> set = new LinkedHashSet<>();
		
		set.add("html");
		set.add("css");
		set.add("javascript");
		
		for(String s : set) {
			System.out.println(s);
		}
		System.out.println(set);
	}

}
