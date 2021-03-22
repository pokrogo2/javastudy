package ex02_generic;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String,Integer> box1 = new Box<>();
		box1.setItem1("James");
		box1.setItem2(90);
		
		System.out.println(box1.getItem1() + ","+box1.getItem2());
		Box<String,Pet> box2 =new Box<>();
		box2.setItem1("앨리스");
		box2.setItem2(new Pet("댕댕이",2));
		System.out.println(box2.getItem1() + " ," + box2.getItem2());

	}

}
