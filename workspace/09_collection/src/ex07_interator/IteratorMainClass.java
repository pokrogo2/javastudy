package ex07_interator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		  Iterator 인터페이스
		  1.collection을 순회할 경우에 사용
		  2.반복자 
		  3. 순회를 하고자하는 collection(list,set) iterator() 메소드를 부착해서 사용
		  4. 인덱스 유무와 상관이없음.
		 */

		Set<String> set = new HashSet<String>();
		set.add("movie");
		set.add("music");
		set.add("sport");
		
		//set를 순회할 수 있는 Iterator 객체 생성
		Iterator<String> itr = set.iterator();//인터페이스는 new 불가능
		//hasNext() : 다음요소가 있으면 true,없으면  false
		//next() : 다음 요소를 가져온다. 
		while(itr.hasNext()) { //남아있는 요소가 있으면 ,없을때까지
			String str=  itr.next();
			System.out.println(str);
		}
		
		List<String> list = new ArrayList<String>();
		
		list.add("운동");
		list.add("뜨개질");
		list.add("요리");
		
		Iterator<String> itr1 = list.iterator();
		
		while(itr1.hasNext()) {
			String str1 = itr1.next();
			System.out.println(str1);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
