package ex08_map;

import java.util.HashMap;
import java.util.Map;

/*
 HashMap클래스
 1. map인터페이스를 수현한 클래스
 2. 데이터를 쌍으로 저장하는 클래스
 3.키(KEY)-값(VALUE) 의 쌍
  	1)키(key) : 중복이 불가능합니다.
  	2)값(value) : 중복이 가능.
  4. 인덱스는 없음. 그 역할을 key가하는것
 */
 

public class HashMapMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Map<String, Integer> sungjuk = new HashMap<>();
		
		sungjuk.put("지구력",80);
		sungjuk.put("근력",70);
		sungjuk.put("인내력",90);
		sungjuk.put("지구력",100);//기존을 덮어씀
		
		sungjuk.remove("근력");
		
		//요소가져오기 
		System.out.println("지구력 : " + sungjuk.get("지구력"));
		System.out.println("인내력 : " + sungjuk.get("인내력"));
		
		
		System.out.println("사이즈 : " + sungjuk.size());
		System.out.println(sungjuk);
	}

}
