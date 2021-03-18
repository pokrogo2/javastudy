package Quiz04;



public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		Book b1 = new Book();
		b1.set("어린왕자","생텍쥐베리",10000);
		b1.info(); // 제목: 어린왕자 , 저자 : 생텍쥐베리 , 가격:10000원
		Book b2 = new Book();
		b2.set("소나기","황순원");
		b2.info();//제목 : 소나기 , 저자 황순원 가격 0
		
		Book b3 = new Book();
		b3.set("홍길동전",5000);
		b3.info(); // 제목:홍길동전 저자 : 미상 가격 5000
		
		System.out.println(b1.info());
		System.out.println(b2.info());
		System.out.println(b3.info());
	}

}
