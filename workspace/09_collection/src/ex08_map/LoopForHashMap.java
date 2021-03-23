package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {
		Map<String, String> me = new HashMap<String, String>();
		me.put("name", "민경태");
		me.put("age", 44+"");
		me.put("phone","010-4444-4444");
		
		//향상 for문은 key만뺍니다..
		
		Set<String> keys = me.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + me.get(k));
		}
		
		//iterator로 순회
		Map<String, String> me1 = new HashMap<String, String>();
		me1.put("name", "민경태");
		me1.put("age", 44+"");
		me1.put("phone","010-4444-4444");
		
		Iterator<String> itr = me1.keySet().iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			String val = me1.get(str);
			System.out.println(str + " : " + val);
		}
		
		
	
		//데이터 쌍으로 뺄 수 있다.
		//entry : key 와 value를 묶어서 entry
		//key : getKey()
		//value : getValue();
		Set<Map.Entry<String, String>> entrys = me.entrySet();
		
		for(Map.Entry<String, String> entry : entrys ) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " +value);
		}
		
		
		//iterator
		Iterator<Map.Entry<String, String>> itr2 = entrys.iterator();
		while(itr2.hasNext()) {
			Map.Entry<String, String> key = itr2.next();
			//Map.Entry<String, String> value = itr2.get(key);
			System.out.println(key + " : ");
		}
		
	}
}
