package ex17_Object.ex04;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product();
		p1.setModel("Ca-001");
		p1.setManufacturer("bio");
		p1.setData("2020-03-03");

	
		p2.setModel("Ca-001");
		p2.setData("2020-03-04");
		p2.setManufacturer("bio");
		
		
		//같은종류의 제품 두개가있는것
		//equals  데이터의 비교x,같은 주소에 저장된 객체인지 다른객체인지 비교
		if(p1.equals(p2)) {
			System.out.println("같은종류");
		}else {
			System.out.println("다른종류");
		}
	}



}
