package ex05_synchronized;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dyson v11 = new Dyson();
		
		Mama mama= new Mama();
		Papa papa= new Papa();
		
		mama.setDyson(v11);
		mama.start();
		
		papa.setDyson(v11);
		papa.start();
		
	}

}
