package quiz03;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		//로또 6개
		
		Set<Integer> lotto = new HashSet<Integer>();
		
		while(lotto.size()!=6){
			lotto.add((int)(Math.random()*45+1));
		}
		System.out.println(lotto);
	}
}
