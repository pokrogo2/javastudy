package ex14_interface;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Zoo zoo = new Zoo(10);
		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Shark());
		zoo.addAnimal(new Eagle());
		
		zoo.info();
	}

}
