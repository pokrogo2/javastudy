package quiz01;
/*
 	슈퍼 : weapon
 	서브 : gun
 */
public class MainClass {
	public static void main(String[] args) {
		
		
		Thread gun1 = new Thread(new Gun("베레타",10));
		Thread gun2 = new Thread(new Gun("콜트",10));
		
		gun1.start();
		gun2.start();
	}

}
