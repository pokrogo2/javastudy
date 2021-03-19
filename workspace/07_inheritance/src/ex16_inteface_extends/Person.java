package ex16_inteface_extends;

public class Person {

	//method
	//1.pet에게 food주기
	
	
	public void feed(Pet pet,String food) {
		pet.feed(food);
	}
	public void walking(Walkable pet) {//Pet pet이되면 snake도 들어갈수밖에없음.walkable pet으로하면 walkable을 받는펫만됨
		System.out.println("Walking with" + ((Pet)pet).getName());
	}
	
}
