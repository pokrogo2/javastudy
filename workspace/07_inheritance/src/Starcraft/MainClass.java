package Starcraft;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Terran[] terrans =new Terran[10];

		
		Bunker bunker = new Bunker();
		bunker.add(new Marine());
		bunker.add(new Firebat());
		//bunker.add(new Tank()); // 불가능
	}

}
